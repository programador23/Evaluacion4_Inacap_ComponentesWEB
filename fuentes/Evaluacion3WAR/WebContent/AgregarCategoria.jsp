<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="CSS/bulma-0.9.0/css/bulma.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Agregar Categoria</title>
</head>
<body>
<h1 class="title">Agregar Categoria</h1>
<div class="tags">
  <span class="tag"><a href="inicioAdministrador.html">Volver al Menu</a></span>
</div>
	<hr>
	<form action="AgregarCategoria" method="post">
		<input class="input" type="text" placeholder="ID de Categoria"
			name="txtidcategoria" required="required"> <br></br> <input class="input"
			type="text" placeholder="Nombre de la Categoria" name="txtcategoria"required="required">

		<br></br> <input class="input" type="text"
			placeholder="Detalle de la Categoria" name="txtdetalle" required="required">

		
		<button class="button"type="submit" value="2" name="btn">Agregar</button>

	</form>
	${mensaje}
</body>
</html>