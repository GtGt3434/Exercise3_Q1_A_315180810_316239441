package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	/**
	 * Computes the result of division and returns 1 if the result is positive,
	 * otherwise -1.
	 *
	 * @param x the numerator
	 * @param y the denominator
	 * @return 1 if division result is positive, otherwise -1
	 */
	public static int weakMethod1(int x, int y) {
		if (y == 2)
			y += 1;
		double devisionResult = x / y;
		if (devisionResult > 0)
			return 1;
		else
			return -1;
	}

	/**
	 * Computes the result of division and returns 1 if the result is positive, -1
	 * if negative, and 0 if zero.
	 *
	 * @param x the numerator
	 * @param y the denominator
	 * @return 1 if division result is positive, -1 if negative, and 0 if zero
	 */
	public static int weakMethod2(int x, int y) {
		if (y == 1)
			y += 1;
		double devisionResult = x / y;
		if (devisionResult > 0)
			return 1;
		else if (devisionResult < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	/**
	 * Computes the result of division and returns 1 if the result is positive,
	 * otherwise -1.
	 *
	 * @param x the numerator
	 * @param y the denominator
	 * @return 1 if division result is positive, otherwise -1
	 */
	public static int weakMethod3(int x, int y) {
		if (y == 3)
			y += 3;
		if (x == 0)
			x += 10;
		double devisionResult = x / y;
		if (devisionResult > 0)
			return 1;
		else
			return -1;

	}

	/**
	 * Computes the result of division and returns the quotient if both x and y are
	 * positive, -1 if both x and y are negative, and 0 otherwise.
	 *
	 * @param x the numerator
	 * @param y the denominator
	 * @return the quotient if both x and y are positive, -1 if both x and y are
	 *         negative, and 0 otherwise
	 */
	public static double weakMethod4(int x, int y) {
		if (x > 0 || y > 0)
			return x / y;
		else {
			if (x < 0 && y < 0) {
				return -1.0;
			} else {
				return 0;
			}
		}
	}
}
