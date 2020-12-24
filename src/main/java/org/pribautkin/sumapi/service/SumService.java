package org.pribautkin.sumapi.service;

import org.pribautkin.sumapi.controller.dto.SumFloatDto;
import org.pribautkin.sumapi.service.result.SumResult;
import org.springframework.stereotype.Service;

@Service
public class SumService {

    public SumResult sum(SumFloatDto dto) {
        if (dto.getFirstNum()==null || dto.getSecondNum()==null) {
            throw new RuntimeException("Invalid input numbers");
        }
        return new SumResult(dto.getFirstNum() + dto.getSecondNum());
    }
}
