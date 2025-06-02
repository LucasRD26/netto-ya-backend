package com.nettoya.service;

import com.nettoya.model.Disponibilidad;
import com.nettoya.repository.DisponibilidadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DisponibilidadService {

    private final DisponibilidadRepository disponibilidadRepository;

    public Disponibilidad crearDisponibilidad(Disponibilidad disponibilidad) {
        return disponibilidadRepository.save(disponibilidad);
    }

    public List<Disponibilidad> listarDisponibilidades() {
        return disponibilidadRepository.findAll();
    }

    public Optional<Disponibilidad> obtenerDisponibilidadPorId(Long id) {
        return disponibilidadRepository.findById(id);
    }

    public List<Disponibilidad> buscarPorLimpiador(Long limpiadorId) {
        return disponibilidadRepository.findByLimpiadorId(limpiadorId);
    }

    public List<Disponibilidad> buscarPorLimpiadorYFecha(Long limpiadorId, LocalDate fecha) {
        return disponibilidadRepository.findByLimpiadorIdAndFecha(limpiadorId, fecha);
    }

    public void eliminarDisponibilidad(Long id) {
        disponibilidadRepository.deleteById(id);
    }
}

