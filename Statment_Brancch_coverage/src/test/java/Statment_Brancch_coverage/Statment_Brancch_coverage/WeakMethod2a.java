package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

/**
 * This JUnit test class aims to create a test case that achieves less than 100%
 * branch coverage for the weakMethod2 function in the WeakClass while exposing
 * the division by zero error.
 */
public class WeakMethod2a {
	/**
	 * This test method verifies that the weakMethod2 function throws an
	 * ArithmeticException when attempting to perform a division by zero. It aims to
	 * achieve less than 100% branch coverage.
	 */
	@Test(expected = ArithmeticException.class)
	public void WeakMethod_Zero_Divition_2() {
		WeakClass.weakMethod2(7, 0);
	}
}
