<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="CSS/bulma-0.9.0/css/bulma.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>lista de productos</title>

</head>

<body>

<h1 class="title">Tabla de Productos</h1>
<div class="tags">
  <span class="tag"><a href="login.jsp">Cerrar Sesion</a></span>
</div>
<hr>
</tr>

<from action="ListaProductos" method="post">
<select>
<c:forEach items ="${categorias}" var="l">
<option>${po.idcategoria}</option>
</c:forEach>
</select>

<input type="submit" value="filtrar">
<br>


</from>




<table class="table is-narrow">
<c:forEach items ="${listaProducto}" var="l">

      
      
<tr>
<th>${l.idproducto}</th>

<th>${l.nombre}</th>
<th>${l.descripcion}</th>
<th>${l.precio}</th>
<th>${l.stock}</th>
<th> ${l.stokminimo}</th>
<th>${l.idcategoria}</th>

</tr>
</c:forEach>
</table>

</body>
</html>