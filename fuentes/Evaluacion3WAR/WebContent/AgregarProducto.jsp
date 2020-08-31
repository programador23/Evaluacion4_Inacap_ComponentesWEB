<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="CSS/bulma-0.9.0/css/bulma.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Agregar producto</title>
</head>
<body>
<h1 class="title">Agregar Producto</h1>
<div class="tags">
  <span class="tag"><a href="inicioAdministrador.html">Volver al Menu</a></span>
</div>
	<hr>
	<form action="ControladorProducto" method="post">
		<input class="input" type="number" placeholder="ID del Producto"
			name="txtidproducto"required="required"> <br></br> <input class="input"
			type="text" placeholder="nombre del Producto" name="txtnombre" required="required">

		<br></br> <input class="input" type="text"
			placeholder="Descripcion del Producto" name="txtdescripcion"required="required">

		<br></br> <input class="input" type="number"
			placeholder="Precio del Producto" name="txtprecio"required="required"> <br></br>

		<input class="input" type="number" placeholder="Stock del Producto"
			name="txtstock"required="required"> <br></br> <input class="input" type="number"
			placeholder="Stock Minimo del Producto" name="txtstockminimo"required="required">

		<br></br> <input class="input" type="text"
			placeholder="ID de Categoria" name="txtidcategoria"required="required">
		<button class="button"type="submit" value="2" name="btn">Agregar</button>

	</form>
	${mensaje}
</body>
</html>