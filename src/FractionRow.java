import java.util.Scanner;

public class FractionRow {
    static double i;
    static double length;
    static double sum;
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the denominator");
        length = in.nextDouble();
        if (length>0) {
            for (i=1;i<=length;i++) {
                sum+=1/i;
            }
            System.out.println("Sum of row = "+sum);
        }
        else if (length<0) {
            for(i = -1; i>= length; i--) {
                sum+=1/i;
            }
            System.out.println("Sum of row = "+sum);
        }
        else {System.out.println("Division by zero");}
    }
}
