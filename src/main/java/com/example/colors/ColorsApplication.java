package com.example.colors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:db.properties")
@SpringBootApplication
public class ColorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColorsApplication.class, args);
    }

}
