package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

import static org.junit.Assert.*;

public class WeakMethod1a {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void WeakMethod_Zero_Divition() {
		try {
			WeakClass.weakMethod1(10, 0);
			fail("No ArithmeticException Was Thrown");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	@Test
	public void weakMethod_Positive() {
		int expected = 1, result = WeakClass.weakMethod1(10, 2);
		assertEquals(expected, result);
	}

	@Test
	public void weakMethod_Negative() {
		int expected = -1, result = WeakClass.weakMethod1(-10, 2);
		assertEquals(expected, result);
	}
}
