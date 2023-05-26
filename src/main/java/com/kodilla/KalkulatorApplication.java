package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KalkulatorApplication.class, args);

        Calculator firstFunction = new Calculator();

        firstFunction.calculatorAdd(10, 5);

        firstFunction.calculatorSubtract(10, 5);
    }

}
