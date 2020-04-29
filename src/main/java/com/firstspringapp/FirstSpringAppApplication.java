package com.firstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to my first spring app");
        SpringApplication.run(FirstSpringAppApplication.class, args);
    }

}
