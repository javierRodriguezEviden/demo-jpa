package com.javier_rc.demo_jpa.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
@Table(
    name = "usuario",
    uniqueConstraints = {
        @jakarta.persistence.UniqueConstraint(columnNames = "dni"),
        @jakarta.persistence.UniqueConstraint(columnNames = "email")
    }
)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "El DNI no puede estar vacío")
    @Size(min = 8, max = 12, message = "El DNI debe tener entre 8 y 12 caracteres")
    private String dni;

    @NotBlank(message = "El email no puede estar vacío")
    @Email(message = "El email debe tener un formato válido")
    private String email;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(max = 50, message = "El nombre no puede exceder los 50 caracteres")
    private String nombre;

    @NotBlank(message = "Los apellidos no pueden estar vacíos")
    @Size(max = 100, message = "Los apellidos no pueden exceder los 100 caracteres")
    private String apellidos;

    @Pattern(regexp = "\\d{9}", message = "El teléfono debe contener exactamente 9 dígitos")
    private String telefono;

    @NotNull(message = "El campo socio no puede ser nulo")
    private Boolean socio;
}