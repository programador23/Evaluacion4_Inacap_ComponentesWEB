<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="CSS/bulma-0.9.0/css/bulma.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Eliminar Producto</title>

<h3 class="title is-3"><p>ID a Eliminar : ${param.idproducto}</p></h3>
<h2 class="subtitle"><p>Esta seguro de eliminar?</p></h2>


<button class="button is-rounded"><a href="ListaProductos"> NO </a></button>

<button class="button is-rounded"><a href="EliminarProducto?txtidproducto=${param.idproducto}"> SI </a></button>
<h4>${mensaje}</h4>
</head>
<body>

</body>
</html>