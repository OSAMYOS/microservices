package com.mohammad.microservices.limits_service.controller;

import com.mohammad.microservices.limits_service.bean.Limits;
import com.mohammad.microservices.limits_service.configuration.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private final Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits() {

        return new Limits(configuration.getMin(), configuration.getMax());
    }
}
