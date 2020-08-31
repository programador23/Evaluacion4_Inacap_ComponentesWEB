<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar</title>
</head>
<body>
	<h3>Eliminar</h3>
	<hr>
	<h3>Opciones</h3>

	<ul>
		<li><a href="agregar.jsp">Agregar Usuario</a></li>
		<li><a href="Controlador?btn=1">Lista De Usuario</a></li>
	</ul>
<hr>
<p>ID a Eliminar : ${param.id}</p>
<p>Esta seguro de eliminar?</p>
<a href="index.jsp"> NO</a>
<a href="Controlador?txtidusuario=${param.idusuario}&btn=3">SI</a>
<h4>${mensaje}</h4>

</body>
</html>