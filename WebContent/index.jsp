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
	CRUD USUARIOS:<br>
	Nombre: <input type="text" name="nombre"><br>
	DNI: <input type="text" name="dni"><br>
	Nota: <input type="text" name="nota"><br>
	<input type="hidden" name="accion" value="CREAR">
	<input type="submit" value="Enviar">
</form>

<br>
<a href="index_cursos.jsp">Enlace a cursos</a><br>
<%
for(Alumno alu: Control.listaAlumno.values()){
	out.print(alu.getNombre() + " "+ alu.getDni()+ " "+ alu.getNota()+
			"<a href=\"Control?accion=BORRAR&id="+alu.getId()+"\"> Borrar</a><a href=\"Control?accion=MODIFICARREDIRECCION&id="+alu.getId()+"\"> Modificar</a><br>") ;
}
%>


</body>
</html>