package com.javier_rc.demo_jpa.persistencia;

import org.springframework.stereotype.Service;

import com.javier_rc.demo_jpa.Usuario.Usuario;
import com.javier_rc.demo_jpa.Usuario.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepo;

    public void createUsuario(Usuario usuario){
        usuarioRepo.save(usuario);
    }

    
    public void updateUsuario(Integer id, Usuario usuarioData) {
        Usuario usuario = usuarioRepo.findById(id)
        .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + id));

        // Sobrescribir el usuario completo
        usuarioData.setId(usuario.getId()); // Asegúrate de mantener el mismo ID
        usuarioRepo.save(usuarioData);
    }
    
    
    public void deleteUsuario(Integer id) {
        Usuario usuario = usuarioRepo.findById(id)
        .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + id));

        usuarioRepo.delete(usuario);
    }
        
}
