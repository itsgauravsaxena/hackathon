package math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlgebraTest {

    private Algebra algebraUnderTest;

    @BeforeEach
    public void setUp() {
        algebraUnderTest = new Algebra();
    }

    @Test
    public void testAddNumbers() {
        // Setup
        final int a = 0;
        final int b = 0;
        final int expectedResult = 0;

        // Run the test
        final int result = algebraUnderTest.addNumbers(a, b);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testDivideNumbers() throws NegativeNotAllowedException,ArithmeticException{
        // Setup
        final int a = 10;
        final int b = 2;
        final int expectedResult = 5;

        // Run the test
        final int result = algebraUnderTest.divideNumbers(a, b);

        // Verify the results
        assertEquals(expectedResult, result);
    }


    @Test
    public void testDivideNumbers_ThrowsNegativeNotAllowedException() throws Exception {
        // Setup
        final int a = -6;
        final int b = -2;
        //final int expectedResult = 0;

        // Run the test
        assertThrows(NegativeNotAllowedException.class, () -> {
            algebraUnderTest.divideNumbers(a, b);
        });
    }


    @Test
    public void testDivideNumbers_ThrowsArithmeticException() throws Exception {
        // Setup
        final int a = 10;
        final int b = 0;
        final int expectedResult = 0;

        // Run the test
        assertThrows(ArithmeticException.class, () -> {
            algebraUnderTest.divideNumbers(a, b);
        });
    }
}
