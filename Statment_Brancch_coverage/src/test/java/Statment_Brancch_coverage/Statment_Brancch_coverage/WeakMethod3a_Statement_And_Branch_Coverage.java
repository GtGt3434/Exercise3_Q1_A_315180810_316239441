package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod3a_Statement_And_Branch_Coverage {
	@Test
	public void Positive_result() {
		assertEquals(1, WeakClass.weakMethod3(0, 3));
	}

	@Test
	public void Negative_result() {
		assertEquals(-1, WeakClass.weakMethod3(0, -3));
	}
}
