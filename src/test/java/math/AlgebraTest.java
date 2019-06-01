package math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgebraTest {

    private Algebra algebraUnderTest;

    @BeforeEach
    public void setUp() {
        algebraUnderTest = new Algebra();
    }

    @DisplayName("Adding 2 numbers")
    @Test
    public void testAddNumbers() {
        // Setup
        final int a = 2;
        final int b = 3;
        final int expectedResult = 5;

        // Run the test
        final int result = algebraUnderTest.addNumbers(a, b);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @DisplayName("Divide two numbers")
    @Test
    public void testDivideNumbers() {
        // Setup
        final int a = 10;
        final int b = 2;
        final double expectedResult = 5.0;

        // Run the test
        final double result = algebraUnderTest.divideNumbers(a, b);

        // Verify the results
        assertEquals(expectedResult, result, 0.0001);
    }


}
