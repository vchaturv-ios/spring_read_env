package com.codevish.spring_read_env.dto;

public class AppDto {

    private String name;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AppDto(String name, String version) {
        this.name = name;
        this.version = version;
    }
}
