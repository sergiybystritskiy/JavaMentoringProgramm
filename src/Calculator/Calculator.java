package Calculator;

public class Calculator {

    private static double result;
    private double memorySlot;

    public static double addition(double firstNumber, double secondNumber) {
        System.out.println("Result calculated is " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }

    public static double subtraction(double firstNumber, double secondNumber) {
        System.out.println("Result calculated is " + (firstNumber - secondNumber));
        return firstNumber - secondNumber;
    }

    public static double division(double firstNumber, double secondNumber) {
        System.out.println("Result calculated is " + (firstNumber / secondNumber));
        return firstNumber / secondNumber;
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        System.out.println("Result calculated is " + (firstNumber * secondNumber));
        return firstNumber * secondNumber;
    }

    public double addToMemory(double number) {
        this.memorySlot += number;
        System.out.println("Memory contains number " + memorySlot);
        return this.memorySlot;
    }

    public double substractFromMemory(double number) {
        this.memorySlot -= number;
        System.out.println("Memory contains number " + memorySlot);
        return this.memorySlot;
    }

    public double clearMemory() {
        this.memorySlot = 0;
        System.out.println("Memory contains is empty");
        return this.memorySlot;
    }
}
