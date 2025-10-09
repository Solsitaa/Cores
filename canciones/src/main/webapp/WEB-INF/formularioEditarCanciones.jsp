<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Actualizar cancion</title>
</head>
<body>
	<h1> Actualizar cancion</h1>
	<form method="GET" action="/canciones">
		<button> Lista de canciones</button>
		</form>
		  <div>
		   <div>
                <form:form action="/editar/cancion/${idCancion }}" method="POST" modelAttribute="libro">
                    <input type="hidden" name="_method" value="PUT">
                    <div>
              <form:label path="titulo">
                            Título: 
                        </form:label>
                        <form:input path="titulo" type="text"/>
                        <form:errors class="alert alert-danger mensaje-error" path="titulo"/>
                    </div>
                    <div>
                        <form:label path="autor">
                            Autor: 
                        </form:label>
                        <form:input path="autor" type="text"/>
                        <form:errors class="alert alert-danger mensaje-error" path="autor"/>
                    </div>
                    <div>
                        <form:label  path="genero">
                            Género: 
                        </form:label>
                        <form:input  path="genero" type="text"/>
                        <form:errors class="alert alert-danger mensaje-error" path="genero"/>
                    </div>
                    <div>
                        <form:label  path="anio">
                            Año: 
                        </form:label>
                        <form:input path="anio" type="date"/>
                        <form:errors class="alert alert-danger mensaje-error" path="anio"/>
                    </div>
                     <button>
                        Actualizar
                    </button>
                </form:form>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
</body>
</html>