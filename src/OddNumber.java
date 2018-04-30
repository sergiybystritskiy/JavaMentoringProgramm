import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number");
        Double number = in.nextDouble();
        if (number%2==0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
