package com.codevish.spring_read_env.controller;

import com.codevish.spring_read_env.dto.DatabaseDto;
import com.codevish.spring_read_env.service.SpringProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/profile", produces = "application/json")
public class SpringProfileController {

    private SpringProfileService springProfileService;

    public SpringProfileController(SpringProfileService springProfileService) {
        this.springProfileService = springProfileService;
    }

    @GetMapping("/read")
    private ResponseEntity<DatabaseDto> fetchDbdetails() {
        DatabaseDto responseDto = springProfileService.fetchDetails();
        return ResponseEntity.status(HttpStatus.OK).body(responseDto);
    }

    
}
