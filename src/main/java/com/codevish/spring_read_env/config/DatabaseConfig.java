package com.codevish.spring_read_env.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"jpe", "jpw"})
public class DatabaseConfig implements DatabaseConfiguration {
    @Value("${region}")
    private String region;

    @Value("${host}")
    private String host;

    @Value("${port}")
    private int port;

    @Value("${url}")
    private String url;

    @Value("${user}")
    private String user;

    @Value("${password}")
    private String password;


    @Override
    public String getRegion() {
        return region;
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public int getPort() {
        return port;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
