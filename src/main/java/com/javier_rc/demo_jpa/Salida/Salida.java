package com.javier_rc.demo_jpa.Salida;

import java.time.LocalDateTime;

import com.javier_rc.demo_jpa.Barco.Barco;
import com.javier_rc.demo_jpa.Usuario.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
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

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "barco_id")
    private Barco barco;
}
