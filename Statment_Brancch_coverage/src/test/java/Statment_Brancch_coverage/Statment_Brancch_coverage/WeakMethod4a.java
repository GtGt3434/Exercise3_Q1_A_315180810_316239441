package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod4a {
	@Test
	public void Positive_result() {
		assertEquals(2, WeakClass.weakMethod4(10, 5), 0.001);
	}

	@Test
	public void Negative_result() {
		assertEquals(-1.0, WeakClass.weakMethod4(-10, -5), 0.001);
	}

	@Test
	public void SecondNegative_result() {
		assertEquals(0, WeakClass.weakMethod4(0, -5), 0.001);
	}
}
