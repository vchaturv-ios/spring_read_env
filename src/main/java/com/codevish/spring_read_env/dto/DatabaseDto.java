package com.codevish.spring_read_env.dto;

public class DatabaseDto {

    private String region;
    private String host;
    private int port;
    private String url;
    private String user;
    private String password;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DatabaseDto(String region, String host, int port, String url, String user, String password) {
        this.region = region;
        this.host = host;
        this.port = port;
        this.url = url;
        this.user = user;
        this.password = password;
    }
}
