package com.example.demo;

import com.example.demo.config.ApplicationConfig;
import com.example.demo.db.Employer;
import com.example.demo.service.EmployeeProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// @SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        EmployeeProvider employer = context.getBean(EmployeeProvider.class);
        //employer.showInfoOfEmployer();
        // employer.getEmployee();
        System.out.println(employer.getEmployee());
    }

}
