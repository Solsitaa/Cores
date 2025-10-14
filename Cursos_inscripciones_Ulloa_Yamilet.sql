INSERT INTO estudiantes(nombres, edad)
VALUES('Javier', 26),
('Eduardo', 56),
('Javiera', 25),
('Roberto', 30),
('Lourdes', 24);

SELECT * 
FROM estudiantes;

INSERT INTO cursos(nombre, duracion)
VALUES('algebra', 2),
('calculo', 2),
('ingles', 1),
('economia', 1);

SELECT * 
FROM cursos;

INSERT INTO inscripciones(cursos_id, estudiantes_id)
VALUES(1, 4),
(2,3),
(3,1),
(4, 2),
(3, 2),
(1, 1);

SELECT *
FROM inscripciones;

SELECT estudiantes.id, estudiantes.nombres  -- Proyecta todos los estudiantes que están inscritos en un curso específico, utilizando el nombre del curso como criterio de búsqueda.
FROM estudiantes 
JOIN inscripciones  ON estudiantes.id = inscripciones.estudiantes_id
JOIN cursos  ON inscripciones.cursos_id = cursos.id
WHERE cursos.nombre = 'algebra';

SELECT cursos.id, cursos.nombre -- Proyecta todos los cursos en los que está inscrito un estudiante específico, utilizando su nombre como criterio de búsqueda.
FROM cursos
JOIN inscripciones ON cursos.id = inscripciones.cursos_id
JOIN estudiantes ON inscripciones.estudiantes_id = estudiantes.id
WHERE estudiantes.nombres = 'Javier';

SELECT cursos.nombre AS curso, COUNT(estudiantes.id) AS cantidad_estudiantes -- Cuenta el número de estudiantes inscritos en cada curso y muestra el nombre del curso junto con el número de estudiantes inscritos.
-- estoy copiando y pegando lo que me piden para tenerlos cuando los necesite y acordarme qué me pedían.
FROM cursos 
LEFT JOIN inscripciones ON cursos.id = inscripciones.cursos_id
LEFT JOIN estudiantes ON estudiantes.id = inscripciones.estudiantes_id
GROUP BY cursos.nombre;

SELECT estudiantes.id, estudiantes.nombres
FROM estudiantes 
LEFT JOIN inscripciones ON estudiantes.id = inscripciones.estudiantes_id
WHERE inscripciones.estudiantes_id IS NULL;