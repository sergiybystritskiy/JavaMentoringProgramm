import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double x1;
        double x2;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter variable a");
        Double a = in.nextDouble();
        System.out.println("Please enter variable b");
        Double b = in.nextDouble();
        System.out.println("Please enter variable c");
        Double c = in.nextDouble();
        if(a == 0) {
            x1 = -c / b;
            x2 = x1;
            System.out.println("Root is" + x2);
        } else {
            double discriminant = b * b - 4 * a * c;

            if(discriminant < 0) {
                System.out.println("No real root");
            } else {
                if(discriminant == 0) {
                    x1 = (-b / (2 * a));
                    x2 = x1;
                    System.out.println("Root is" + x2);
                } else {
                    x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                    System.out.println("Root 1 is " + x1);
                    System.out.println("Root 2 is " + x2);
                }
            }
        }
    }
}
