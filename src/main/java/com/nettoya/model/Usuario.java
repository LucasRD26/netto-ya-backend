package com.nettoya.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.nettoya.model.enums.Rol;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String contrasena;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Rol rol;

    private String direccion;

    private BigDecimal valoracion;

    private LocalDateTime fechaRegistro;

    // Relaciones
    @JsonManagedReference(value = "usuario-reservas-cliente")
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Reserva> reservasComoCliente;

    @JsonManagedReference(value = "usuario-reservas-limpiador")
    @OneToMany(mappedBy = "limpiador", fetch = FetchType.LAZY)
    private List<Reserva> reservasComoLimpiador;
}

