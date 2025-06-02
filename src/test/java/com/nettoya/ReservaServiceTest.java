package com.nettoya;

import com.nettoya.model.Reserva;
import com.nettoya.repository.ReservaRepository;
import com.nettoya.service.ReservaService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReservaServiceTest {

    @Autowired
    private ReservaService reservaService;

    @Test
    void testListarReservas() {
        List<Reserva> reservas = reservaService.listarReservas();
        assertNotNull(reservas);
        assertFalse(reservas.isEmpty());
    }
}
