import static java.lang.Math.*;


public class QuadraticEquation {

    public static final double DELTA = 0.000000001;


    public static double[] solve(double a, double b, double c) throws Exception {
        if (abs(a) < DELTA) {
            if (abs(b) < DELTA) {
                if (abs(c) < DELTA)
                    throw new Exception();
                return new double[]{};
            }
            return new double[]{-c / b};
        }

        double D = pow(b, 2) - 4 * a * c;

        if (abs(D) < DELTA) {
            return new double[]{-b / (2 * a)};
        }

        if (D > 0) {
            return new double[]{
                    (-b - sqrt(D)) / (2 * a),
                    (-b + sqrt(D)) / (2 * a)
            };
        }
        return new double[]{};
    }
}