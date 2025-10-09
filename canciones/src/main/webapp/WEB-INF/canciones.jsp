<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>App de canciones</title>
</head>
<body>
	<h1>Lista de canciones</h1>
	<form method="GET" action="/formulario/canciones">
	<button>
		Agregar canción
	</button>
	</form>
	<c:forEach var="cancion" items= "${listaCanciones}">
	<h2>${cancion.titulo}</h2>
	<form method="GET" action="/detalle/cancion/${idCancion}">
		<button>
		Detalle
		</button>
	</form>
	<form method="POST" action="/eliminar/cancion/{idCancion}">
		<input type="hidden" name="_method" value="DELETE">
		<button>
		Eliminar
		</button>
	</form>
	</c:forEach>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>