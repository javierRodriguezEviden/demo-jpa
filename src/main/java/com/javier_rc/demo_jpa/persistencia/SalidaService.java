package com.javier_rc.demo_jpa.persistencia;

import org.springframework.stereotype.Service;

import com.javier_rc.demo_jpa.Salida.Salida;
import com.javier_rc.demo_jpa.Salida.SalidaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SalidaService {

    private final SalidaRepository salidaRepo;

    public void createSalida(Salida salida){
        salidaRepo.save(salida);
    }

}
