package com.codevish.spring_read_env.config;

public interface DatabaseConfiguration {

    String getRegion();
    String getHost();
    int getPort();
    String getUrl();
    String getUser();
    String getPassword();
}
