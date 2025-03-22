package com.codevish.spring_read_env.service;

import com.codevish.spring_read_env.config.AppConfig;
import com.codevish.spring_read_env.config.DatabaseConfig;
import com.codevish.spring_read_env.config.DatabaseConfiguration;
import com.codevish.spring_read_env.dto.AppDto;
import com.codevish.spring_read_env.dto.DatabaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringProfileService {

    private final DatabaseConfiguration dbConfig;
    private final AppConfig appConfig;

    @Autowired
    public SpringProfileService(DatabaseConfiguration dbConfig, AppConfig appConfig) {

        this.dbConfig = dbConfig;
        this.appConfig = appConfig;
    }

    public DatabaseDto fetchDetails() {
        if (dbConfig != null) {
            return new DatabaseDto(
                    dbConfig.getRegion(),
                    dbConfig.getHost(),
                    dbConfig.getPort(),
                    dbConfig.getUrl(),
                    dbConfig.getUser(),
                    dbConfig.getPassword()
            );
        } else {
            throw new RuntimeException("No profile is active!");
        }
    }

    public AppDto fetchAppConfig() {
        if (appConfig != null) {
            return new AppDto(
                    appConfig.getName(),
                    appConfig.getVersion()
            );
        } else {
            throw new RuntimeException("No profile is active!");
        }
    }
}
