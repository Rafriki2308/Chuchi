package com.bosonit.examenJPA.headerBill.infrastructure.output;

import com.bosonit.examenJPA.customer.infrastructure.output.CustomerOutputDto;
import com.bosonit.examenJPA.headerBill.domain.HeaderBill;
import com.bosonit.examenJPA.line.infrastructure.controller.output.LineOutputDto;
import com.bosonit.examenJPA.line.infrastructure.controller.output.LineResponseDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacturaOutputDto {

    @Autowired
    @JsonIgnore //Esta anotacion evita que se muestre por pantalla este atributo
    private LineResponseDto lineResponseDto;

    private int idFra;
    private Double importeFra;

    private CustomerOutputDto cabeceraCliente;
    List<LineOutputDto> lineasFactura = new ArrayList<>();

    public FacturaOutputDto(HeaderBill headerBill){
        setIdFra(headerBill.getId());
        setCabeceraCliente(new CustomerOutputDto(headerBill.getCustomer()));
        setImporteFra(headerBill.getImporteFra());
        setLineasFactura(lineResponseDto.mappingLineToLineDto(headerBill.getLineas()));
    }
}
