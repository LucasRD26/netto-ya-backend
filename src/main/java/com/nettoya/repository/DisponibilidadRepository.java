package com.nettoya.repository;

import com.nettoya.model.Disponibilidad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface DisponibilidadRepository extends JpaRepository<Disponibilidad, Long> {
    List<Disponibilidad> findByLimpiadorId(Long limpiadorId);
    List<Disponibilidad> findByLimpiadorIdAndFecha(Long limpiadorId, LocalDate fecha);
}
