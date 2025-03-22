package com.codevish.spring_read_env.dto;

public class ResponseDto {

    private String name;
    private int age;
    private String designation;
    private String address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public String address() {
        return address;
    }

    public ResponseDto(String name, int age, String designation, String address) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.address = address;
    }
}
