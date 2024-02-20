package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod2b {
	@Test
	public void weakMethod_Positive_2() {
		assertEquals(1, WeakClass.weakMethod2(3, 2));
	}
	
	@Test
	public void weakMethod_Negative_2() {
		assertEquals(-1, WeakClass.weakMethod2(-5, 2));
	}
	
	@Test
	public void weakMethod_Zero_2() {
		assertEquals(0, WeakClass.weakMethod2(0, 2));
	}
}
