package com.codevish.spring_read_env.controller;

import com.codevish.spring_read_env.dto.ResponseDto;
import com.codevish.spring_read_env.service.ReadEnvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
public class ReadEnvFileController {

    @Autowired
    private ReadEnvService readEnvService;

    @GetMapping("/readEnv")
    public ResponseEntity<ResponseDto> readEnvFileValues() {
        ResponseDto responseDto = readEnvService.readEnvFileValues();

        return ResponseEntity.status(HttpStatus.OK).body(responseDto);
    }
}