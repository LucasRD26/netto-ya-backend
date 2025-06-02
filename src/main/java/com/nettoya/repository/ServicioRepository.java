package com.nettoya.repository;

import com.nettoya.model.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicioRepository extends JpaRepository<Servicio, Long> {
    // Puedes agregar métodos personalizados si los necesitas
}
