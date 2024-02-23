package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	public static int weakMethod1(int x, int y) {
		if (y == 2)
			y += 1;
		double devisionResult = x / y;
		if (devisionResult > 0)
			return 1;
		else
			return -1;
	}

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
