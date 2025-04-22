package com.javier_rc.demo_jpa.logica;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javier_rc.demo_jpa.Usuario.Usuario;
import com.javier_rc.demo_jpa.persistencia.UsuarioService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public void createUsuario(@RequestBody Usuario usuario){
        usuarioService.createUsuario(usuario);
    }

    
    @PutMapping("/{id}")
        public void updateUsuario(@PathVariable Integer id, @RequestBody Usuario usuarioData) {
            usuarioService.updateUsuario(id, usuarioData);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Integer id) {
        usuarioService.deleteUsuario(id);
    }

}
