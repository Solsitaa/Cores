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
	<form method="GET"  action="/formulario/actualizar/cancion">
	<buttom>
	Actualizar
	<a href="/canciones"> </a>
	</buttom>
	</form>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>