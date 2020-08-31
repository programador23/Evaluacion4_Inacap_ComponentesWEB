<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">

<title>Lista Usuarios</title>
<link href="CSS/bulma-0.9.0/css/bulma.min.css" rel="stylesheet">
</head>
<body>
<h1 class="title">Lista de Usuarios</h1>
<table class="table">
<c:forEach items ="${lista}" var ="l">
<tr>
<th><abbr title="position">ID: </abbr>${l.idusuario}</th>
<th><abbr title="Position">Nombre: </abbr>${l.nombre}</th>
<th><abbr title="Position">Apellido: </abbr>${l.apellido}</th>
<th><abbr title="Position">Correo: </abbr>${l.correo}</th>
<th><abbr title="Position">Password: </abbr>${l.password}</th>
<th><abbr title="Position">Tipo de Usurario: </abbr>${l.tipousuario}</th>








</tr>
</c:forEach>
</table>
</body>
</html>