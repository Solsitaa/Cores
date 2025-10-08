<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalle canciones</title>
<title>Canciones</title>
</head>
<body>
	<h1> Detalle de la canción: ${cancion.titulo}</h1>
		<nav>
		<form method= "GET" action="/cancion">
		<buttom>
			Lista de canciones
			</buttom>
		</form>
			</nav>
	<p>Titulo: %{cancion.titulo}</p>
	<p>Artista: ${cancion.artista}</p>
	<p>Género: ${cancion.genero} </p>
	<p>Idioma: ${cancion.idioma }</p>
	<buttom>
	<a href="/canciones/detalle/{idCancion}"></a>
	Volver a la lista de canciones
	</buttom>
</body>
</html>