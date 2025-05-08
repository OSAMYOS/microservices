package com.mohammad.microservices.limits_service.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties("limits-service")
public class Configuration {


    private int min;
    private int max;

}
