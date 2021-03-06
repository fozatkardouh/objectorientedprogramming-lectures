package oop.polymorphism.calculator2.controller;

import oop.polymorphism.calculator2.model.operator.Operator;
import oop.polymorphism.calculator2.model.operator.Operators;

import java.util.Optional;

// calculator for every operation in the world
public class Calculator {

    public Double calculate(String operation) {
        Double first = getFirstNumber(operation);
        Double second = getSecondNumber(operation);
        String symbol = getSymbol(operation);

        Optional<Operator> operator = Operators.of(symbol);
        if (operator.isPresent()) {
            return operator.get().operate(first, second);
        }
        return null;
    }

    private Double getFirstNumber(String operation) {
        String first = String.valueOf(operation.charAt(0));
        return Double.parseDouble(first);
    }

    private Double getSecondNumber(String operation) {
        String first = String.valueOf(operation.charAt(2));
        return Double.parseDouble(first);
    }

    private String getSymbol(String operation) {
        return String.valueOf(operation.charAt(1));
    }
}
