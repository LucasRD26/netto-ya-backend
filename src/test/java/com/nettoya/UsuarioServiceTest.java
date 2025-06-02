package com.nettoya;

import com.nettoya.model.Usuario;
import com.nettoya.service.UsuarioService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UsuarioServiceTest {

    @Autowired
    private UsuarioService usuarioService;

    @Test
    void testListarUsuarios() {
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        assertNotNull(usuarios);
        assertFalse(usuarios.isEmpty());
    }
}
