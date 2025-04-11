package com.javier_rc.demo_jpa.Salida;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Salida {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    
    @NotNull(message = "La fecha no puede ser nula")
    @Future(message = "La fecha debe estar en el futuro")
    private LocalDateTime fecha;

    @NotBlank(message = "El destino no puede estar vacío")
    @Size(max = 50, message = "El destino no puede exceder los 50 caracteres")
    private String destino;
}
