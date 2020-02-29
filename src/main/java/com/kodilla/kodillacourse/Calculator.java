package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {
    private int numberA;
    private int numberB;

    public Calculator(int numberA, int numberB){
        this.numberA= numberA;
        this.numberB= numberB;
    }
    public int add(){
        return numberA+numberB;
    }
    public int substract(){
        return numberA-numberB;
    }
}
