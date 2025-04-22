package com.javier_rc.demo_jpa.persistencia;

import org.springframework.stereotype.Service;

import com.javier_rc.demo_jpa.Barco.Barco;
import com.javier_rc.demo_jpa.Barco.BarcoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BarcoService {

    private final BarcoRepository barcoRepo;

    public void createBarco(Barco barco){
        System.out.println("Usuario asignado al barco: " + barco.getUsuario()); //!PRUEBA
        barcoRepo.save(barco);
    }
}
