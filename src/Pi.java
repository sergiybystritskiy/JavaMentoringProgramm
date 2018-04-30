public class Pi {
    static double i;
    static double p;
    static double multilplier=1;
    public static void main (String args[]) {
        for (i=1;i<=1000000;i+=2) {
            p+=multilplier*(4/i);
            multilplier=(-multilplier);
        }
        System.out.printf("%.10f",p);
        System.out.println();
        System.out.println(Math.PI);
    }
}
