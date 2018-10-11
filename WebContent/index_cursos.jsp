<%@page import="edu.ucam.beans.Curso"%>
<%@page import="edu.ucam.beans.Alumno"%>
<%@page import="edu.ucam.servlet.Control"%>
<%@ taglib uri="mistags" prefix="llamadaEtiqueta" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
<llamadaEtiqueta:tagLogin/>
<form action="Control" method="POST">
	CRUD CURSOS:<br>
	Nombre del curso: <input type="text" name="nombre"><br>
	Edad de los alumnos: <input type="text" name="edad"><br>
	Nº de alumnos: <input type="text" name="alumnos"><br>
	<input type="hidden" name="accion" value="CREARCURSO">
	<input type="submit" value="Enviar">
</form>
<a href="index.jsp">Enlace a alumnos</a><br>
<%
for(Curso cur: Control.listaCurso.values()){
	out.print(cur.getNombre() + " "+ cur.getEdad()+ " "+ cur.getAlumnos()+"<a href=\"Control?accion=BORRARCURSO&id="+cur.getId()+"\"> Borrar</a><a href=\"Control?accion=MODIFICARCURSOREDIRECCION&id="+cur.getId()+"\"> Modificar</a><br>") ;
}
%>



</body>
</html>