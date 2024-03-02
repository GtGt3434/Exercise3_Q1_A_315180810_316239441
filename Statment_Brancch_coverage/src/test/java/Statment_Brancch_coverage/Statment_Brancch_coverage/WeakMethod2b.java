package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This JUnit test class aims to create a test suite that achieves 100% branch
 * coverage for the weakMethod2 function in the WeakClass without exposing the
 * division by zero error.
 */
public class WeakMethod2b {
	/**
	 * This test method verifies that the weakMethod2 function returns the expected
	 * result when dividing two numbers where the result is positive.
	 */
	@Test
	public void weakMethod_Positive_2() {
		assertEquals(1, WeakClass.weakMethod2(3, 1));
	}

	/**
	 * This test method verifies that the weakMethod2 function returns the expected
	 * result when dividing two numbers where the result is negative.
	 */
	@Test
	public void weakMethod_Negative_2() {
		assertEquals(-1, WeakClass.weakMethod2(-5, 2));
	}

	/**
	 * This test method verifies that the weakMethod2 function returns the expected
	 * result when dividing zero by a non zero denominator.
	 */
	@Test
	public void weakMethod_Zero_2() {
		assertEquals(0, WeakClass.weakMethod2(0, 2));
	}
}
