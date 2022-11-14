package com.bosonit.examenJPA.headerBill.infraestructure.output;

import com.bosonit.examenJPA.customer.infraestructure.output.CustomerOutputDto;
import com.bosonit.examenJPA.headerBill.domain.HeaderBill;
import com.bosonit.examenJPA.line.infraestructure.controller.output.LineOutputDto;
import com.bosonit.examenJPA.line.infraestructure.controller.output.LineResponseDto;
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
    @JsonIgnore
    private LineResponseDto lineResponseDto;

    private int idFra;
    private Double importeFra;
    private CustomerOutputDto customerOutputDto;
    List<LineOutputDto> linesOutputDtos = new ArrayList<>();

    public FacturaOutputDto(HeaderBill headerBill){
        setIdFra(headerBill.getId());
        setCustomerOutputDto(new CustomerOutputDto(headerBill.getCustomer()));
        setImporteFra(headerBill.getImporteFra());
        setLinesOutputDtos(lineResponseDto.mappingLineToLineDto(headerBill.getLineas()));
    }
}
