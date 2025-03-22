package com.codevish.spring_read_env.service;

import com.codevish.spring_read_env.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class ReadEnvService {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

    @Value("${designation}")
    private String designation;

    @Value("${address}")
    private String address;

    public ResponseDto readEnvFileValues() {
        return new ResponseDto(name, age, designation, address);
    }
}
