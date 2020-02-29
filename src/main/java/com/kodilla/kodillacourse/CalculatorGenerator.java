package com.kodilla.kodillacourse;

public class CalculatorGenerator {
    public static void main(String[] args) {
        //SpringApplication.run(Calculator.class, args);
        Calculator calculator = new Calculator(8,9);
        int resultAdd=  calculator.add();
        System.out.println("Result Addition:" + resultAdd );
        int resultSubstraction = calculator.substract();
        System.out.println("Result Substraction:" + resultSubstraction );
    }
}
