package com.hk.userservice.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Slf4j
public class SetupInitialDataManager implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("SetupInitialDataManager:::::::::: This is user service microservice for learning purpose");
    }
}
