package fast_power;

/*
 * https://xuanwo.org/2015/03/18/number-theory-quick-pow/
 */

public class Fast1 {
	double fastPower(int x, int n) {
		// handle base is zero.
		if (x == 0 && n == 0) {
			throw new IllegalArgumentException("0 to the power of 0 is illegal.");
		}
		else if (x == 0 && n < 0) {
			throw new IllegalArgumentException("This is illegal.");
		}
		else if (x == 0) {
			return 0;
		}
		
		if (n == 0) {
			return 1;
		}
		else if (x == 1) {
			return 1;
		}
		else if (x == -1) {
			if ((n & 1) == 1) {
				return -1;
			}
			else
				return 1;
		}
		int rslt = 1;
		boolean positive = true;
		if (n < 0) {
			n = -n;
			positive = false;
		}
		
		while (n != 0) {
			if ((n & 1) == 1) {          // If n is odd.
				rslt *= x;
			}
			x *= x;
			n >>= 1;
		}
		
		if (positive)
			return rslt;
		else
			return 1.0/rslt;
	}

}
