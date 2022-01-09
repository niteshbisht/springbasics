package com.example.demo.config;

import com.example.demo.db.Employer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(basePackages = "com.example.demo.*")
public class ApplicationConfig {

    @Bean("stateStreet")
    Employer stateStreet() {
        return new Employer(101);
    }

    @Bean("morganStanley")
    Employer morganStanley() {
        return new Employer(102);
    }
}
