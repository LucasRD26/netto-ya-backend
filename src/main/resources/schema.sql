DROP TABLE IF EXISTS pago;
DROP TABLE IF EXISTS reserva;
DROP TABLE IF EXISTS disponibilidad;
DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS servicio;

CREATE TABLE usuario (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    telefono VARCHAR(20) NOT NULL,
    contrasena VARCHAR(255) NOT NULL,
    rol VARCHAR(20) NOT NULL,
    direccion VARCHAR(255),
    valoracion DECIMAL(3,2),
    fecha_registro DATETIME
);

CREATE TABLE servicio (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255),
    precio_base DECIMAL(10,2) NOT NULL,
    duracion_estimada INT NOT NULL
);

CREATE TABLE reserva (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    cliente_id BIGINT NOT NULL,
    limpiador_id BIGINT,
    servicio_id BIGINT NOT NULL,
    fecha_hora_inicio DATETIME NOT NULL,
    fecha_hora_fin DATETIME NOT NULL,
    direccion VARCHAR(255) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    notas VARCHAR(255),
    FOREIGN KEY (cliente_id) REFERENCES usuario(id),
    FOREIGN KEY (limpiador_id) REFERENCES usuario(id),
    FOREIGN KEY (servicio_id) REFERENCES servicio(id)
);

CREATE TABLE pago (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    reserva_id BIGINT NOT NULL UNIQUE,
    monto DECIMAL(10,2) NOT NULL,
    metodo VARCHAR(20) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    transaccion_id VARCHAR(255),
    fecha_pago DATETIME,
    FOREIGN KEY (reserva_id) REFERENCES reserva(id)
);

CREATE TABLE disponibilidad (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    limpiador_id BIGINT NOT NULL,
    fecha DATE NOT NULL,
    hora_inicio TIME NOT NULL,
    hora_fin TIME NOT NULL,
    FOREIGN KEY (limpiador_id) REFERENCES usuario(id)
);
