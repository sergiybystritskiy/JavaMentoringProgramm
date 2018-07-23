import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuadraticEquationTest {

    public static final double DELTA = 0.000001;

    @Test public void testSimple() throws Exception {

        assertArrayEquals(new double[] { 0.0 }, QuadraticEquation.solve(1.0, 0.0, 0.0), DELTA);
    }

    @Test public void twoSolutions() throws Exception {
        assertArrayEquals(new double[] { -1.0, 1.0 }, QuadraticEquation.solve(1.0, 0.0, -1.0), DELTA);
        assertArrayEquals(new double[] { -2.0, 2.0 }, QuadraticEquation.solve(1.0, 0.0, -4.0), DELTA);
    }

    @Test public void twoSolutionsBNotNull() throws Exception {
        assertArrayEquals(new double[] { 1.0, 2.0 }, QuadraticEquation.solve(1.0, -3.0, 2.0), DELTA);
    }

    @Test public void oneSolution() throws Exception {
        assertArrayEquals(new double[] { -1.0 }, QuadraticEquation.solve(1.0, 2.0, 1.0), DELTA);
    }

    @Test public void testNoSolutions() throws Exception {
        assertArrayEquals(new double[] {}, QuadraticEquation.solve(1.0, 0.0, 1.0), DELTA);

        assertArrayEquals(new double[] {}, QuadraticEquation.solve(3.0, 0.0, 10.0), DELTA);
    }

    @Test public void testZeroA() throws Exception {
        assertArrayEquals(new double[] { -0.5 }, QuadraticEquation.solve(0.0, 2.0, 1.0), DELTA);

        assertArrayEquals(new double[] { 10.0 }, QuadraticEquation.solve(0.0, 1.0, -10.0), DELTA);
    }

    @Test public void testZeroAZeroB() {
        try {
            assertArrayEquals(new double[] {}, QuadraticEquation.solve(0.0, 0.0, 1.0), DELTA);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = Exception.class) public void testZeroAZeroBZeroC() throws Exception {
        assertArrayEquals(new double[] {}, QuadraticEquation.solve(0.0, 0.0, 0.0), DELTA);
    }
}

