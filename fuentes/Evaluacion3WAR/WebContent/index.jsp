<%@page import="cl.inacap.Evaluacion3Modelo.dto.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Usuario</title>
</head>
<body>
<% Usuario user=(Usuario) session.getAttribute("user");
if(user !=null){
%>
<nav>
Bienvenido<%= user.getNombre() +" "%>
	<h1>Que desea Realizar</h1>
	<hr>
	<h3>opciones</h3>
	<ul>
		<li><a href="agregar.jsp">agregar Usuario</a></li>
		<li><a href="Controlador?btn=1">Lista de Usuario</a></li>
		<li><a href="ListaProductos">Lista de Producto</a></li>
		<li><a href="AgregarProducto.jsp">Agregar Producto</a></li>
		<li><a href="login.html">inicio de secion</a></li>
		<li><a href="ListaCategoria">Lista Categoria</a></li>
	
	</ul>
	</nav>
	<hr>
	<% } else { %>
	<div>
	<h4>No tiene Permiso para acceder</h4>
	<a href="login.html">Ir a inicio</a>
	</div>
	<%} %>
</body>
</html>