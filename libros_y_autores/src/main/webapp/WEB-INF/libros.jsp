<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Libros</title>
</head>
<body>
	<h1>Los libros son: </h1>
	<ul>
		<c:forEach var= "libros" items= "${listaLibros}">
			<li>	${libros}
				</li>
		</c:forEach>
	</ul>
	<ul>
	<li>
		<a href="/libros/Don Quijote de la Mancha"> Don Quijote de la Mancha </a>
	</li>
</ul>
</body>
</html>