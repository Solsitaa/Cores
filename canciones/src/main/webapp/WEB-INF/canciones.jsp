<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Canciones</title>
</head>
<body>
	<h1>Lista de canciones</h1>
	<h2>
		<c:forEach var="cancion" items=${listaCanciones }>
		<h2> ${cancion.titulo} </h2>
		<form method="GET" action="/detalle/cancion/${cancion.ed }">
			<button> Detalle</button>
	</h2>
</body>
</html>