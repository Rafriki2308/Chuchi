package com.bosonit.examenJPA.headerBill.infraestructure.controller;

import com.bosonit.examenJPA.headerBill.application.HeaderBillServiceImp;
import com.bosonit.examenJPA.headerBill.infraestructure.output.FacturaOutputDto;
import com.bosonit.examenJPA.line.application.LineServiceImp;
import com.bosonit.examenJPA.line.infraestructure.controller.output.LineOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BillController {

    @Autowired
    private HeaderBillServiceImp hBI;

    @Autowired
    private LineServiceImp lSI;

    @GetMapping("/factura")
    public List<FacturaOutputDto> getAllBills(){
        return hBI.getAllBills();
    }

    @PostMapping("/factura/linea/{idFra}")
    public FacturaOutputDto addLineToBill(@RequestBody LineOutputDto lineOutputDto, @PathVariable String idFra){
        return lSI.addLineWithDto(lineOutputDto, idFra);
    }
    @DeleteMapping("factura/{idFra}")
    public void deleteBillById(@PathVariable String idFra){
        hBI.deleteBillById(idFra);
    }
}
