package com.demo.hello.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Enviroment
 */
@Component
@ConfigurationProperties(prefix = "enviroment")
public class Enviroment {

    private String name;
    
    public String getName() {
       return this.name; 
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Enviroment: %s.", this.name);
    }
}