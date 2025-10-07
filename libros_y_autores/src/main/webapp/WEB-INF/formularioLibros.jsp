<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>
</head>
<body>
	<h1>Agregar libro y autor</h1>
 	<form>
 		<div>
 		<label for= "nombreLibro">
 			Nombre del libro:
 		</label>
 		<input type="text" id= "nombre" name="nombre">
 		</div>
 		<div>
 		<label for= "nombreAutor">
 			Nombre del autor:
 		</label>
 		<input type="text" id= "Autor" name="Autor">
 		</div>
 	</form>
 	<button>
 		<a href= "/procesa/libro"> Agregar </a>	 
 	</button>
</body>
</html>