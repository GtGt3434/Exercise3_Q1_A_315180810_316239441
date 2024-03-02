package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This JUnit test class aims to create a test suite that achieves 100%
 * statement coverage but less than 100% branch coverage for the weakMethod3
 * function in the WeakClass without exposing the division by zero error.
 */
public class WeakMethod3a_Statement_And_Branch_Coverage {
	/**
	 * This test method verifies that the weakMethod3 function returns the expected
	 * result when dividing zero by a non-zero denominator However, it does not
	 * expose the division by zero error, resulting in less than 100% branch
	 * coverage.
	 */
	@Test
	public void Positive_result() {
		assertEquals(1, WeakClass.weakMethod3(0, 3));
	}

	/**
	 * This test method verifies that the weakMethod3 function returns the expected
	 * result when dividing a negative numerator by a positive denominator. However,
	 * it does not expose the division by zero error, resulting in less than 100%
	 * branch coverage.
	 */
	@Test
	public void Negative_result() {
		assertEquals(-1, WeakClass.weakMethod3(-1, 3));
	}
}
