package math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgebraTest {

    private Algebra algebraUnderTest;

    @Before
    public void setUp() {
        algebraUnderTest = new Algebra();
    }

    @Test
    public void testAddNumbers() {
        // Setup
        final int a = 1;
        final int b = 2;
        final int expectedResult = 3;

        // Run the test
        final int result = algebraUnderTest.addNumbers(a, b);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testDivideNumbers() throws Exception {
        // Setup
        final int a = 10;
        final int b = 2;
        final int expectedResult = 5;

        // Run the test
        final int result = algebraUnderTest.divideNumbers(a, b);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideNumbers_ThrowsArithmeticException() throws Exception {
        // Setup
        final int a = 10;
        final int b = 0;

        // Run the test
        algebraUnderTest.divideNumbers(a, b);
    }

    @Test(expected = NegativeNotAllowedException.class)
    public void testDivideNumbers_ThrowsNegativeNotAllowedException() throws Exception {
        // Setup
        final int a = -4;
        final int b = 2;

        // Run the test
        algebraUnderTest.divideNumbers(a, b);
    }
}
