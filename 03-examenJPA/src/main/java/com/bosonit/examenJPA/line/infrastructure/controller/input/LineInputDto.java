package com.bosonit.examenJPA.line.infrastructure.controller.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LineInputDto {

    private String producto;
    private double cantidad ;
    private double importe;
}
