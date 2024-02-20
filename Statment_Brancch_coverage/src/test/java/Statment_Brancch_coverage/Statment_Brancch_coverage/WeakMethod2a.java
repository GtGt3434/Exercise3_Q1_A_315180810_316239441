package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class WeakMethod2a {
	@Test(expected = ArithmeticException.class)
	public void WeakMethod_Zero_Divition_2() {
		WeakClass.weakMethod2(7, 0);
	}
}
