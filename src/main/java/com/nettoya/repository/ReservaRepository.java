package com.nettoya.repository;

import com.nettoya.model.Reserva;
import com.nettoya.model.enums.EstadoReserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findByClienteId(Long clienteId);
    List<Reserva> findByLimpiadorId(Long limpiadorId);
    List<Reserva> findByEstado(EstadoReserva estado);
    List<Reserva> findByLimpiadorIdAndEstado(Long limpiadorId, EstadoReserva estado);
}

