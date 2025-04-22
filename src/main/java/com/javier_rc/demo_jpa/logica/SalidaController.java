package com.javier_rc.demo_jpa.logica;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javier_rc.demo_jpa.Salida.Salida;
import com.javier_rc.demo_jpa.persistencia.SalidaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/salida")
@RequiredArgsConstructor
public class SalidaController {

    private final SalidaService salidaService;

    @PostMapping
    public void createSalida(@RequestBody Salida salida){
        salidaService.createSalida(salida);
    }

    @PutMapping("/{id}")
        public void updateSalida(@PathVariable Integer id, @RequestBody Salida salidaData) {
            salidaService.updateSalida(id, salidaData);
    }

    @DeleteMapping("/{id}")
    public void deleteSalida(@PathVariable Integer id) {
        salidaService.deleteSalida(id);
    }

}
