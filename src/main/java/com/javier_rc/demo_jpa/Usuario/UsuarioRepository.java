package com.javier_rc.demo_jpa.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Integer>{
/* En la declaración de la interfaz UsuarioRepository que extiende JpaRepository<Usuario, Integer>,
el segundo parámetro Integer se refiere al tipo de dato del identificador (ID) de la entidad Usuario. */
}
