<%@page import="edu.ucam.beans.Alumno"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
Alumno alu = (Alumno)request.getAttribute("alumno");
%>

<form action="Control" method="POST">
	Nombre: <input type="text" name="nombre" value="<% out.print(alu.getNombre()); %>"><br>
	DNI: <input type="text" name="dni" value="<% out.print(alu.getDni()); %>"><br>
	Nota: <input type="text" name="nota" value="<% out.print(alu.getNota()); %>"><br>
	<input type="hidden" name="accion" value="MODIFICAR">
	<input type="hidden" name="id" value="<% out.print(alu.getId()); %>">
	<input type="submit" value="Enviar">
</form>


</body>
</html>