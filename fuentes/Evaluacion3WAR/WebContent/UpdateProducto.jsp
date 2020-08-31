<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="CSS/bulma-0.9.0/css/bulma.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Actualizar Producto</title>
</head>
<body>
<h1 class="title">Actualizar Producto</h1>
<div class="tags">
  <span class="tag"><a href="inicioAdministrador.html">Volver al Menu</a></span>
</div>
	<hr>
	<form action="UpdateProducto" method="post">
		<input class="input" type="number" placeholder="ID del Producto"
			value="${param.idproducto}"name="txtidproducto"readonly> 
			<br></br> <input class="input"
			type="text" placeholder="nombre del Producto" value="${param.nombre}" name="txtnombre" required="required">

		<br></br> <input class="input" type="text"
			placeholder="Descripcion del Producto" value="${param.descripcion}" name="txtdescripcion" required="required">

		<br></br> <input class="input" type="number"
			placeholder="Precio del Producto" value="${param.precio}" name="txtprecio"required="required"> <br></br>

		<input class="input" type="number" placeholder="Stock del Producto"
			value="${param.stock}"name="txtstock"> <br></br> <input class="input" type="number"
			placeholder="Stock Minimo del Producto" value="${param.stockminimo}" name="txtstockminimo"required="required">

		<br></br> <input class="input" type="text"
			placeholder="ID de Categoria" value="${param.idcategoria}"name="txtidcategoria" required="required">
		<button class="button" type="submit" value="2" name="btn">Actualizar</button>

	</form>
	${mensaje}
</body>
</html>