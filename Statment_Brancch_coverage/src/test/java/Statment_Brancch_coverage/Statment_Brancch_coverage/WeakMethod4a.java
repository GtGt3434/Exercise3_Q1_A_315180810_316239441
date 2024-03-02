package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This JUnit test class aims to create a test suite that achieves 100% branch
 * coverage for the weakMethod4 function in the WeakClass without exposing the
 * division by zero error.
 */
public class WeakMethod4a {

	/**
	 * This test method verifies that the weakMethod4 function returns the expected
	 * result when both x and y are positive numbers.
	 */
	@Test
	public void Positive_result() {
		assertEquals(2, WeakClass.weakMethod4(10, 5), 0.001);
	}

	/**
	 * This test method verifies that the weakMethod4 function returns the expected
	 * result when both x and y are negative numbers.
	 */
	@Test
	public void Negative_result() {
		assertEquals(-1.0, WeakClass.weakMethod4(-10, -5), 0.001);
	}

	/**
	 * This test method verifies that the weakMethod4 function returns the expected
	 * result when either x or y is zero or one is zero and the other is negative.
	 */
	@Test
	public void SecondNegative_result() {
		assertEquals(0, WeakClass.weakMethod4(0, -5), 0.001);
	}
}
