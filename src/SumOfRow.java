import java.util.Scanner;

public class SumOfRow {
    static double i;
    static double length;
    static double sum;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the row length in integer");
        length = in.nextInt();
        if (length>=0) {
            for (i=1;i<=length;i++) {
                sum+=i;
            }
            System.out.println("Sum of row = "+sum);
        }
            else {
            for(i = 0; i >= length; i--) {
                sum+=i;
            }
            System.out.println("Sum of row = "+sum);
        }

        if (length!=0)
        System.out.println("Average of the row ="+ sum/Math.abs(length));
        else {System.out.println("Empty row");}
        }
    }
