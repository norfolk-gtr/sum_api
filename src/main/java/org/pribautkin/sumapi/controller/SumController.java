package org.pribautkin.sumapi.controller;

import org.pribautkin.sumapi.controller.dto.SumFloatDto;
import org.pribautkin.sumapi.service.SumService;

import org.pribautkin.sumapi.service.result.SumResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(value = {"/api"}, produces = "application/json;charset=UTF-8")
public class SumController {

    @Autowired
    private SumService service;

    @PostMapping("/sum")
    public ResponseEntity<SumResult> postSum(@RequestBody @Valid SumFloatDto dto) {
        return ResponseEntity.ok(service.sum(dto));
    }

}