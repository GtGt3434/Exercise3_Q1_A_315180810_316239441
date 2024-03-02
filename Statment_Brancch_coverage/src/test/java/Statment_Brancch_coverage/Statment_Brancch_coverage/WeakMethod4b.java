package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This JUnit test class aims to create a test suite that achieves less than
 * 100% branch coverage for the weakMethod4 function in the WeakClass while
 * exposing the division by zero error.
 */
public class WeakMethod4b {

	/**
	 * This test method verifies that the weakMethod4 function returns the expected
	 * result when both x and y are positive numbers.
	 */
	@Test
	public void Both_Positive() {
		double expected = 10 / 5;
		assertEquals(expected, WeakClass.weakMethod4(10, 5), 0.001);
	}

	/**
	 * This test method verifies that the weakMethod4 function returns the expected
	 * result when both x and y are negative numbers.
	 */
	@Test
	public void Both_Negative() {
		assertEquals(-1.0, WeakClass.weakMethod4(-10, -5), 0.001);
	}

	/**
	 * This test method verifies that the weakMethod4 function returns the expected
	 * result when x is positive and y is negative.
	 */
	@Test
	public void First_Postive_Second_Negative() {
		double expected = -10 / 5;
		assertEquals(expected, WeakClass.weakMethod4(10, -5), 0.001);
	}

	/**
	 * This test method verifies that the weakMethod4 function returns the expected
	 * result when x is zero and y is negative.
	 */
	@Test
	public void First_Zero_Seocond_Negative() {
		assertEquals(0, WeakClass.weakMethod4(0, -5), 0.001);
	}

	/**
	 * This test method verifies that the weakMethod4 function throws an
	 * ArithmeticException when attempting to perform a division by zero.
	 */
	@Test(expected = ArithmeticException.class)
	public void First_Positive_Seocond_Zero() {
		assertEquals(0, WeakClass.weakMethod4(10, 0), 0.001);
	}
}
