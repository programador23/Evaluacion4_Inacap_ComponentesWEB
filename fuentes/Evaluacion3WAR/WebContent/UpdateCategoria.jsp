<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="CSS/bulma-0.9.0/css/bulma.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Actualizar Categoria</title>
</head>
<body>
<h1 class="title">Actualizar Categoria</h1>
<div class="tags">
  <span class="tag"><a href="inicioAdministrador.html">Volver al Menu</a></span>
</div>
	<hr>
	<form action="UpdateCategoria" method="post">
		<input class="input" type="text" placeholder="ID de Categoria"
			value="${param.idcategoria}"name="txtidcategoria" readonly="readonly""> <br></br> <input class="input"
			type="text" placeholder="Nombre de la Categoria" value="${param.categoria}"name="txtcategoria"required="required">

		<br></br> <input class="input" type="text"
			placeholder="Detalle de la Categoria" value="${param.detalle}"name="txtdetalle" required="required">

		
		<button class="button"type="submit" value="2" name="btn">Actualizar</button>

	</form>
	${mensaje}
</body>
</html>