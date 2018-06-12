package Calculator;

import java.io.IOException;
import java.util.Scanner;

public class CalculatorUser {
    public static void main(String[] args) throws IOException {

        double result;
        Calculator calc = new Calculator();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number");
        Double firstNumber = in.nextDouble();
        System.out.println("Please enter the operation you want to perform");
        System.out.println("1 - addition");
        System.out.println("2 - substraction");
        System.out.println("3 - division");
        System.out.println("4 - multiplication");
        int operation = in.nextInt();
        System.out.println("Please enter second number");
        Double secondNumber = in.nextDouble();
        if(operation == 1) {
            result = calc.addition(firstNumber, secondNumber);
        } else if(operation == 2) {
            result = calc.subtraction(firstNumber, secondNumber);
        } else if(operation == 3) {
            result = calc.division(firstNumber, secondNumber);
        } else if(operation == 4) {
            result = calc.multiplication(firstNumber, secondNumber);
        } else {throw new IllegalArgumentException("Unsupported calculator 1"
                + "operation"); }
        System.out.println("Please choose next action");
        System.out.println("1 - add result to memory");
        System.out.println("2 - substract result from memory");
        System.out.println("3 - clear memory");
        System.out.println("4 - close calculator");
        Double nextAction = in.nextDouble();
        if(nextAction == 1) {
            calc.addToMemory(result);
        }
        if(nextAction == 2) {
            calc.substractFromMemory(result);
        }
        if(nextAction == 3) {
            calc.clearMemory();
        }
    }
}
