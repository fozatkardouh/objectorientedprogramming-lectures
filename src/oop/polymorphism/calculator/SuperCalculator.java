package oop.polymorphism.calculator;

import oop.polymorphism.calculator.controller.Calculator;
import oop.polymorphism.calculator.model.Result;
import oop.polymorphism.calculator.view.Display;
import oop.polymorphism.calculator.view.Keyboard;

public class SuperCalculator {

    private Keyboard keyboard = new Keyboard();
    private Calculator calculator = new Calculator();
    private Display display = new Display();

    public void run() {
        // ask user for operation (ie. 4+5)
        // calculate result
        // display result (ie. 4 plus 5 equals 9)
        // -----

        String operation = keyboard.getOperation();
        Double result = calculator.calculate(operation);
        display.display(result);
    }

}
