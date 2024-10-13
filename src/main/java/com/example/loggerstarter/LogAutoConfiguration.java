package com.example.loggerstarter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogAutoConfiguration {

    @Bean
    public LogScheduler logScheduler() {
        return new LogScheduler();
    }
}
