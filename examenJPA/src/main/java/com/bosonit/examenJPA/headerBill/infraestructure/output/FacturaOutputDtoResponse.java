package com.bosonit.examenJPA.headerBill.infraestructure.output;

import com.bosonit.examenJPA.headerBill.domain.HeaderBill;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class FacturaOutputDtoResponse {

    public static List<FacturaOutputDto> mappingFacturaToFacturaOutputDto(List<HeaderBill> headerBills){
        List <FacturaOutputDto> facturaOutputDtoList = new ArrayList<>();
        for (HeaderBill hB: headerBills) {
            facturaOutputDtoList.add(new FacturaOutputDto(hB));
        }
        return facturaOutputDtoList;
    }
}
