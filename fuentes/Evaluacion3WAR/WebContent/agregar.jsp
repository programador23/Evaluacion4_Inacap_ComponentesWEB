<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar Usuario</title>
</head>
<body>
<h3>Agregar</h3>
<hr>
<h3>opciones</h3>
<ul>
<li><a href="agregar.jsp">agregar</a>a</li>
<li><a href="Controlador?btn=1">Lista de Usuario</a>a</li>
</ul>
<hr>
<form action="Controlador?btn=2 "method="post">
<p><label for="txtidusuario">ID de Usuario</label>
<input type="number" name="txtidusuario" required="required">
</p>
<p><label for="txtnombre">Nombre de Usuario</label>
<input type="text" name="txtnombre" required="required">
</p>

<p><label for="txtapellido">Apellido de Usuario</label>
<input type="text" name="txtapellido" required="required">
</p>

<p><label for="txtcorreo">Correo de Usuario</label>
<input type="text" name="txtcorreo" required="required">
</p>

<p><label for="txtpassword">Contraseña de Usuario</label>
<input type="text" name="txtpassword" required="required">
</p>

<p><label for="txttusuario">Tipo de Usuario</label> 
<input type="text" name="txttipousuario" required="required">
</p>
<button type="submit" value="2" name="btn">Agregar</button>

</form>
${mensaje}
</body>
</html>