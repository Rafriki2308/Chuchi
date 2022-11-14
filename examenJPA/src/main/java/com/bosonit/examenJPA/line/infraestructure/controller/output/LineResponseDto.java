package com.bosonit.examenJPA.line.infraestructure.controller.output;

import com.bosonit.examenJPA.line.domain.Line;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LineResponseDto {

    public static List<LineOutputDto> mappingLineToLineDto(List<Line> lines) {
        List<LineOutputDto> linesOutputDtos = new ArrayList<>();

        for (Line line : lines) {
            linesOutputDtos.add(new LineOutputDto(line));

        }
        return linesOutputDtos;
    }

}
