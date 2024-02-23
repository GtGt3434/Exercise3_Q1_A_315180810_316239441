package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod3b_Branch_Coverage {
	@Test
	public void Positive_Result() {
		assertEquals(1, WeakClass.weakMethod3(0, 3));
	}

	@Test
	public void Negative_Result() {
		assertEquals(-1, WeakClass.weakMethod3(5, -5));
	}

	@Test
	public void Positive_Result_X_Not_Zero() {
		assertEquals(1, WeakClass.weakMethod3(15, 5));
	}

	@Test(expected = ArithmeticException.class)
	public void Error_Result() {
		WeakClass.weakMethod3(5, 0);
	}
}
