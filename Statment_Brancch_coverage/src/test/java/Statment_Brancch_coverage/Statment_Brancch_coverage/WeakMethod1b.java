package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod1b {
	@Test
	public void weakMethod_Positive() {
		int expected = 1, result = WeakClass.weakMethod1(10, 2);
		assertEquals(expected, result, 0.001);
	}

	@Test
	public void weakMethod_Negative() {
		int expected = -1, result = WeakClass.weakMethod1(-10, 2);
		assertEquals(expected, result, 0.001);
	}
}
