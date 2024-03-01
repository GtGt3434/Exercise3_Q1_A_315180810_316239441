package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod4b {
	@Test
	public void Both_Positive() {
		double expected = 10 / 5;
		assertEquals(expected, WeakClass.weakMethod4(10, 5), 0.001);
	}

	@Test
	public void Both_Negative() {
		assertEquals(-1.0, WeakClass.weakMethod4(-10, -5), 0.001);
	}

	@Test
	public void First_Negative() {
		double expected = -10 / 5;
		assertEquals(expected, WeakClass.weakMethod4(-10, 5), 0.001);
	}

	@Test
	public void Second_Negative() {
		double expected = -10 / 5;
		assertEquals(expected, WeakClass.weakMethod4(10, -5), 0.001);
	}

	@Test
	public void AtLeastOneZero_result() {
		assertEquals(0, WeakClass.weakMethod4(0, 0), 0.001);
	}

	@Test
	public void First_Zero_Seocond_Negative() {
		assertEquals(0, WeakClass.weakMethod4(0, -5), 0.001);
	}

	@Test
	public void First_Negative_Seocond_Zero() {
		assertEquals(0, WeakClass.weakMethod4(-10, 0), 0.001);
	}
}
