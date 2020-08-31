<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="CSS/bulma-0.9.0/css/bulma.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>lista de Categorias</title>
</head>

<body>

<h1 class="title">Tabla de Categoria</h1>
<div class="tags">
  <span class="tag"><a href="inicioAdministrador.html">Volver al Menu</a></span>
</div>
<hr>


<table class="table is-narrow">
<c:forEach items ="${listacategoria}" var="l">
     
<tr>
<th>${l.idcategoria}</th>
<th>${l.categoria}</th>
<th>${l.detalle}</th>
<td><a href="UpdateCategoria.jsp?idcategoria=${l.idcategoria}&categoria=${l.categoria}&detalle=${l.detalle}">Modificar Categoria</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>