package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

/**
 * WeakMethod1a is a JUnit test class designed to test the behavior of the
 * weakMethod1 function in the WeakClass under certain conditions.
 */
public class WeakMethod1a {
	/**
	 * This test method verifies that the weakMethod1 function throws an
	 * ArithmeticException when attempting to perform a division by zero.
	 */
	@Test(expected = ArithmeticException.class)
	public void WeakMethod_Zero_Divition() {
		WeakClass.weakMethod1(5, 0);
	}
}
