package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * WeakMethod1b is a JUnit test class designed to test the behavior of the
 * weakMethod1 function in the WeakClass under normal conditions without
 * exposing the division by zero error. This test suite aims to achieve 100%
 * statement coverage while not exposing the division by zero error.
 */
public class WeakMethod1b {
	/**
	 * This test method verifies that the weakMethod1 function returns the expected
	 * result when dividing two positive numbers.
	 */
	@Test
	public void weakMethod_Positive() {
		int expected = 1, result = WeakClass.weakMethod1(10, 2);
		assertEquals(expected, result, 0.001);
	}

	/**
	 * This test method verifies that the weakMethod1 function returns the expected
	 * result when dividing two positive numbers.
	 */
	@Test
	public void weakMethod_Negative() {
		int expected = -1, result = WeakClass.weakMethod1(-10, 3);
		assertEquals(expected, result, 0.001);
	}
}
