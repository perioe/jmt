package com.jmt.api.jmtapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jmt")
public class JmtApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmtApiApplication.class, args);
    }

}
