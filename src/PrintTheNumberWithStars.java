
import java.util.Scanner;

public class PrintTheNumberWithStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter integer number equal to row length");
        int rowLength = in.nextInt();
        int numberOfColumns = rowLength;
        for(int i = 1; i <= rowLength; i++) {
            for(int j = 1; j <= rowLength; j++) {
                if(j <= i) {
                    System.out.print(j);
                } else if(j > i && j<rowLength) {
                System.out.print("*");
            }
            else System.out.println("*");
        }
        }
    }
}
