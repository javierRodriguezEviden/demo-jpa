package com.javier_rc.demo_jpa.logica;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javier_rc.demo_jpa.Barco.Barco;
import com.javier_rc.demo_jpa.persistencia.BarcoService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/barco")
@RequiredArgsConstructor
public class BarcoController {

    private final BarcoService barcoService;

    @PostMapping
    public void createBarco(@RequestBody Barco barco) {
        barcoService.createBarco(barco);
    }
    
    @PutMapping("/{id}")
        public void updateBarco(@PathVariable Integer id, @RequestBody Barco barcoData) {
            barcoService.updateBarco(id, barcoData);
    }

    @DeleteMapping("/{id}")
    public void deleteBarco(@PathVariable Integer id) {
        barcoService.deleteBarco(id);
    }
}
