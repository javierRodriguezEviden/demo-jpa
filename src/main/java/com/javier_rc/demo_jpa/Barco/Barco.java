package com.javier_rc.demo_jpa.Barco;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "barco", uniqueConstraints = {
    @jakarta.persistence.UniqueConstraint(columnNames = "matricula"),
    @jakarta.persistence.UniqueConstraint(columnNames = "amarre")
})
public class Barco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /* ejemplo, una matrícula podría verse así: 6ª BA-3-1234-18, lo que indicaría una 
    embarcación deportiva de alquiler registrada en Barcelona,
    en el distrito 3, con el número de folio 1234, y construida o registrada en 2018 */
    @NotNull(message = "La matrícula no puede ser nula") 
    @Pattern(regexp = "^[0-9]{1,2}[A-Z]{2}-[0-9]{1,2}-[0-9]{4}-[0-9]{2}$", message = "La matrícula debe seguir el formato correcto")
    private String matricula;

    /* Los amarres pueden estar divididos en sectores o zonas dentro del puerto. 
    Cada sector puede tener una letra o un nombre que lo identifica, seguido del número de amarre. 
    Por ejemplo, "A-15" podría indicar el amarre número 15 en el sector A. */
    @NotNull(message = "El amarre no puede ser nulo")
    @Pattern(regexp = "^[A-Z]-[0-9]{1,2}$", message = "El amarre debe seguir el formato correcto (ej. A-15)")
    private String amarre;

    @NotNull(message = "El campo cuota no puede ser nulo")
    private int cuota;
}
