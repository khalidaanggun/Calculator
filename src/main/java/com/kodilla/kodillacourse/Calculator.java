package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {
    public void someMethod(){

    }

    public static void main(String[] args) {
        //SpringApplication.run(Calculator.class, args);
        Calculator calculator = new Calculator();
        calculator.someMethod();
        System.out.println("Trial");
    }

}
