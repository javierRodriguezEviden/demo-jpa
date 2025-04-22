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
        barcoRepo.save(barco);
    }

    public void updateBarco(Integer id, Barco barcoData) {
        Barco barco = barcoRepo.findById(id)
        .orElseThrow(() -> new RuntimeException("Barco no encontrado con id: " + id));

        // Sobrescribir el barco completo
        barcoData.setId(barco.getId()); // Asegúrate de mantener el mismo ID
        barcoRepo.save(barcoData);
    }
    
    
    public void deleteBarco(Integer id) {
        Barco barco = barcoRepo.findById(id)
        .orElseThrow(() -> new RuntimeException("Barco no encontrado con id: " + id));

        barcoRepo.delete(barco);
    }
}
