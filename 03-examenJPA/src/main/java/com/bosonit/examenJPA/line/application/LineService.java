package com.bosonit.examenJPA.line.application;

import com.bosonit.examenJPA.headerBill.infraestructure.output.FacturaOutputDto;
import com.bosonit.examenJPA.line.domain.Line;
import com.bosonit.examenJPA.line.infraestructure.controller.input.LineInputDto;
import com.bosonit.examenJPA.line.infraestructure.controller.output.LineOutputDto;
import org.springframework.stereotype.Service;

@Service
public interface LineService {

    public LineOutputDto addLine(Line line);
    public FacturaOutputDto addLineWithDto(LineInputDto lineInputDto, String idFra);

}
