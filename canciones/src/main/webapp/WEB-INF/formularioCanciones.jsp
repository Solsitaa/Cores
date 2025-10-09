<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nueva canción</title>
</head>
<body>
	<h1>Nueva canción</h1>
	<nav>
		<form method="GET" action="/cancion">
			<button>
				lista de canciones
			</button>
		</form>
	</nav>
	<form:form action="/agregar/cancion" method="POST" modelAttribute="nuevaCancion">
	<div>
		<form:label class="form-label" path="titulo">
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
                    			<form:label path="genero">
                    			genero: 
                    	 </form:label>
                        <form:input path="genero" type="text"/>
                        <form:errors class="alert alert-danger mensaje-error" path="genero"/>
                    </div>
                    <div>
                        <form:label path="anio">
                            Año: 
                        </form:label>
                        <form:input path="anio" type="date"/>
                        <form:errors class="alert alert-danger mensaje-error" path="anio"/>
                    </div>
                    <button >
                        Agregar
                    </button>
	</form:form>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
</body>
</html>