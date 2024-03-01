package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class WeakMethod1a {
	/**
	 * Rigorous Test :-)
	 */
	@Test(expected = ArithmeticException.class)
	public void WeakMethod_Zero_Divition() {
		WeakClass.weakMethod1(5, 0);
	}
}
