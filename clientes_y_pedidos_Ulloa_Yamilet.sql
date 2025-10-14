
INSERT INTO clientes(nombre, direccion, telefono)
VALUES('Javier', 'victoria', '56999999'),
	('Gabriela', 'Valdivia', '56999459'),
    ('Gaspar', 'Gorbea', '569659598'),
    ('Luis', 'Rio Bueno', '569886565'),
    ('Juana', 'Coyhaique', '5659556456');
    
    SELECT *
    FROM clientes;
    
    INSERT INTO pedidos(fecha, total, clientes_id)
    values('2025-10-02', '5000.00', 2),
    ('2025-09-22', '150000.00', 1),
    ('2025-09-10', '1359.00', 18),
    ('2025-10-02', '16565.00', 20),
    ('2025-07-02', '659842.00', 19);
  
    SELECT * 
    FROM clientes;
    
    SELECT *
    FROM pedidos;
    
SELECT *
FROM clientes JOIN pedidos
ON clientes.id = pedidos.clientes_id;

SELECT *
FROM pedidos
WHERE pedidos.clientes_id = 1;

SELECT clientes_id, total
FROM pedidos
GROUP BY clientes_id;

DELETE FROM pedidos
WHERE clientes_id = 20;

DELETE FROM clientes
WHERE id = 20;
    