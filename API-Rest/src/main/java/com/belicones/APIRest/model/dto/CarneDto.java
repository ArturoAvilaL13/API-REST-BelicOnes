package com.belicones.APIRest.model.dto;

import jakarta.persistence.Lob;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class CarneDto {
    private int idCarne;
    private String nombreCarne;
    private String descripcionCarne;
    private double precioCarne;
    @Lob
    private String imagenCarne;
    private int fkIdTipoDeCorte;
}
