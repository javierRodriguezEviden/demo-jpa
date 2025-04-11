package com.javier_rc.demo_jpa.Usuario;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepo;

    public void createUsuario(Usuario usuario){
        usuarioRepo.save(usuario);
    }
}
