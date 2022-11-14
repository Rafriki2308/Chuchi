package com.bosonit.examenJPA.headerBill.application;

import com.bosonit.examenJPA.headerBill.domain.HeaderBill;
import com.bosonit.examenJPA.headerBill.infraestructure.output.FacturaOutputDto;
import org.springframework.stereotype.Service;

@Service
public interface HeaderBillService {

    FacturaOutputDto addHeaderBill(HeaderBill headerBill);

    FacturaOutputDto getHeaderBillById(int id);

    HeaderBill getHeaderBillByIdEntity(Integer id);


}
