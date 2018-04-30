import java.util.Scanner;

public class NumberToText {
    public enum Numbers {
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE
    }

    public static void main(String[] args) {
        int digit;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter digit in range from 1 to 9");
        digit = in.nextInt();
        if(digit < 10 && digit > 0) {
            System.out.println(Numbers.values()[digit - 1].name());

        } else {System.out.println("Digit you entered is not in range from 1 to 9");}
    }
}
