package com.bosonit.examenJPA.line.infraestructure.controller.output;

import com.bosonit.examenJPA.line.domain.Line;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LineOutputDto {

    private int idLine;

    @JsonIgnore
    private int idFra;

    private String proNomb;

    private Double cantidad;

    private double precio;



    public LineOutputDto(Line line) {

        setIdLine(line.getIdLine());
        setProNomb(line.getProdName());
        setCantidad(line.getAmountProduct());
        setPrecio(line.getPrice());

    }

}
