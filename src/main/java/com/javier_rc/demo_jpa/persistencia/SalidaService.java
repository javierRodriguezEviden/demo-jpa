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

    public void updateSalida(Integer id, Salida salidaData) {
        Salida salida = salidaRepo.findById(id)
        .orElseThrow(() -> new RuntimeException("Salida no encontrada con id: " + id));

        // Sobrescribir el usuario completo
        salidaData.setId(salida.getId()); // Asegúrate de mantener el mismo ID
        salidaRepo.save(salidaData);
    }
    
    public void deleteSalida(Integer id) {
        Salida salida = salidaRepo.findById(id)
        .orElseThrow(() -> new RuntimeException("Salida no encontrada con id: " + id));

        salidaRepo.delete(salida);
    }

}
