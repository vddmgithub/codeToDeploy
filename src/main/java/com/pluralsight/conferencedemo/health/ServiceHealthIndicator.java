package com.pluralsight.conferencedemo.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class ServiceHealthIndicator implements HealthIndicator {

    @Override
    public Health getHealth(boolean includeDetails) {
        return null;
    }

    @Override
    public Health health() {
        boolean health = Runtime.getRuntime().maxMemory() < (100 * 1024 * 1024);
        Status status = health ? Status.DOWN: Status.UP;
        return Health.status(status).build();
    }
}
