package com.bosonit.examenJPA.headerBill.application;

import com.bosonit.examenJPA.exception.EntityNotFoundException;
import com.bosonit.examenJPA.headerBill.domain.HeaderBill;
import com.bosonit.examenJPA.headerBill.infraestructure.output.FacturaOutputDto;
import com.bosonit.examenJPA.headerBill.infraestructure.output.FacturaOutputDtoResponse;
import com.bosonit.examenJPA.headerBill.infraestructure.repository.HeaderBillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HeaderBillServiceImp implements HeaderBillService{

    @Autowired
    private final HeaderBillRepository headerBillRepository;

    @Autowired
    private FacturaOutputDtoResponse facturaOutputDtoResponse;


    public FacturaOutputDto addHeaderBill(HeaderBill headerBill){
        return new FacturaOutputDto(headerBillRepository.save(headerBill));
    };

    public FacturaOutputDto getHeaderBillById(int id){
        return new FacturaOutputDto(headerBillRepository.findHeaderBillById(id));
    };

    public HeaderBill getHeaderBillByIdEntity(Integer id){
        return headerBillRepository.findHeaderBillById(id);
    }

    public List<FacturaOutputDto> getAllBills(){
        return facturaOutputDtoResponse.mappingFacturaToFacturaOutputDto(headerBillRepository.findAll());
    }

    public void deleteBillById(String id){

        HeaderBill bill = headerBillRepository.findHeaderBillById(Integer.parseInt(id));
        if (bill == null) {
            throw new EntityNotFoundException("Factura no encontrada");
        }
        headerBillRepository.delete(bill);
    }

}
