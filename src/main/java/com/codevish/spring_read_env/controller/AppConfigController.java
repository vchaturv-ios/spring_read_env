package com.codevish.spring_read_env.controller;

import com.codevish.spring_read_env.dto.AppDto;
import com.codevish.spring_read_env.service.SpringProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/appconfig", produces = "application/json")
public class AppConfigController {

    private SpringProfileService springProfileService;

    public AppConfigController(SpringProfileService springProfileService) {
        this.springProfileService = springProfileService;
    }

    @GetMapping("/read")
    private ResponseEntity<AppDto> fetchAppConfig() {
        AppDto responseDto = springProfileService.fetchAppConfig();
        return ResponseEntity.status(HttpStatus.OK).body(responseDto);
    }
}
