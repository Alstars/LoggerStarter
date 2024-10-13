package com.example.loggerstarter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class LogScheduler {

    private static final Logger logger = LoggerFactory.getLogger(LogScheduler.class);

    @Scheduled(fixedRate = 5000)
    public void logMessage() {
        logger.info("{}: logging message every x seconds",Thread.currentThread().getName());
    }
}
