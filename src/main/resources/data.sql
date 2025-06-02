INSERT INTO usuario (nombre, email, telefono, contrasena, rol, direccion, valoracion, fecha_registro)
VALUES 
('Cliente Demo', 'cliente@nettoya.com', '3001112233', '{noop}password', 'CLIENTE', 'Calle 1', 5.0, NOW()),
('Limpiador Demo', 'limpiador@nettoya.com', '3004445566', '{noop}password', 'LIMPIADOR', 'Calle 2', 4.5, NOW());

INSERT INTO servicio (nombre, descripcion, precio_base, duracion_estimada)
VALUES 
('Limpieza básica', 'Limpieza general de hogar', 80.00, 3),
('Limpieza profunda', 'Limpieza detallada de oficina', 150.00, 6);

INSERT INTO reserva (cliente_id, limpiador_id, servicio_id, fecha_hora_inicio, fecha_hora_fin, direccion, estado, notas)
VALUES 
(1, 2, 1, '2025-06-10 09:00:00', '2025-06-10 12:00:00', 'Calle 1', 'PENDIENTE', 'Sin observaciones');

INSERT INTO pago (reserva_id, monto, metodo, estado, transaccion_id, fecha_pago)
VALUES 
(1, 80.00, 'TARJETA', 'COMPLETADO', 'TX123456', NOW());

INSERT INTO disponibilidad (limpiador_id, fecha, hora_inicio, hora_fin)
VALUES 
(2, '2025-06-10', '08:00:00', '17:00:00');
