package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This JUnit test class aims to create a test suite that achieves 100% branch
 * coverage for the weakMethod3 function in the WeakClass while exposing the
 * division by zero error.
 */
public class WeakMethod3b_Branch_Coverage {
	/**
	 * This test method verifies that the weakMethod3 function returns the expected
	 * result when dividing zero by a non-zero denominator.
	 */
	@Test
	public void Positive_Result() {
		assertEquals(1, WeakClass.weakMethod3(0, 3));
	}

	/**
	 * This test method verifies that the weakMethod3 function returns the expected
	 * result when dividing a positive numerator by a negative denominator.
	 */
	@Test
	public void Negative_Result() {
		assertEquals(-1, WeakClass.weakMethod3(5, -5));
	}

	/**
	 * This test method verifies that the weakMethod3 function throws an
	 * ArithmeticException when attempting to perform a division by zero.
	 */
	@Test(expected = ArithmeticException.class)
	public void Error_Result() {
		WeakClass.weakMethod3(5, 0);
	}
}
