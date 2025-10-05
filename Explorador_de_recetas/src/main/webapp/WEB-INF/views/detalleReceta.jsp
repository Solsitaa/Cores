<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalle recetas</title>
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
 <c:choose>
            <%-- Si la receta NO fue encontrada --%>
            <c:when test="${not empty mensaje}">
                <div class="error">
                    <p>❌ ${mensaje}</p>
                </div>
            </c:when>
            
            <%-- Si la receta SÍ fue encontrada --%>
            <c:otherwise>
                <div class="receta-info">
                    <h2>📋 ${nombre}</h2>
                    <h3>Ingredientes necesarios:</h3>
                    <ul class="ingredientes-lista">
                        <c:forEach var="ingrediente" items="${ingredientes}">
                            <li>✓ ${ingrediente}</li>
                        </c:forEach>
                    </ul>
                </div>
            </c:otherwise>
        </c:choose>
</body>
</html>