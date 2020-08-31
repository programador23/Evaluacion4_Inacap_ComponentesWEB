<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio de Secion</title>
</head>
<link href="CSS/bulma-0.9.0/css/bulma.min.css" rel="stylesheet">
<body>
<h1 class="title">Inicio de secion</h1>
<from action="Valida" method="post">
<table>
<tr>

</tr>
<tr>
<td><h6 class="title is-6">Usuario:</h6></td>
<td><input class="input" type="text" placeholder="Usuario"id=txtnombre required="required"></td>



<td><h6 class="title is-6">Contraseña:</h6></td>
<td><input class="input" type="password" placeholder="Contraseña" id=txtpassword required="required"></td>
<hr>
<td><button class="button">Ingresar</button></td>

</tr>

	

</table>
</form>
<ul>
		<li><a href="ListaProductosClientes">Inicio cliente</a></li>
		<li><a href="inicioAdministrador.html">Inicio Admin</a></li>
	</ul>
${error}
</body>
</html>