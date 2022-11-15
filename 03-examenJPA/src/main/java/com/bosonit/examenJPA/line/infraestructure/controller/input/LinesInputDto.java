package com.bosonit.examenJPA.line.infraestructure.controller.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinesInputDto {

    private String producto;
    private double cantidad ;
    private double importe;
}
