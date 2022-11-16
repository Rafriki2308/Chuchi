package com.bosonit.examenJPA.line.application;

import com.bosonit.examenJPA.exception.EntityNotFoundException;
import com.bosonit.examenJPA.headerBill.application.HeaderBillServiceImp;
import com.bosonit.examenJPA.headerBill.domain.HeaderBill;
import com.bosonit.examenJPA.headerBill.infrastructure.output.FacturaOutputDto;
import com.bosonit.examenJPA.line.domain.Line;
import com.bosonit.examenJPA.line.infrastructure.controller.input.LineInputDto;
import com.bosonit.examenJPA.line.infrastructure.controller.output.LineOutputDto;
import com.bosonit.examenJPA.line.infrastructure.repository.LineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LineServiceImp implements LineService {

    @Autowired
    private final LineRepository lineRepository;
    @Autowired
    private final HeaderBillServiceImp headerBillServiceImp;

    public LineOutputDto addLine(Line line) {

        return new LineOutputDto(lineRepository.save(line));
    }

    public FacturaOutputDto addLineWithDto(LineInputDto lineInputDto, String idFra) {

        HeaderBill headerBill = headerBillServiceImp.getHeaderBillByIdEntity(Integer.parseInt(idFra));
        if (headerBill == null) {
            throw new EntityNotFoundException("Factura no encontrada");
        }

        Line line = new Line(lineInputDto, headerBill);
        Line line1 = lineRepository.save(line);

        return headerBillServiceImp.getHeaderBillById(line1.getHeaderBill().getId());
    }

}

