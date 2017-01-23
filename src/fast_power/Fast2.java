package fast_power;

/*
 * http://baike.baidu.com/view/4533005.htm
 * http://morris821028.github.io/2015/05/16/security-notes3/
 */

public class Fast2 {
	double fastPower2(int x, int n) {
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
		
		boolean positive = true;
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
		else {
			if (n < 0) {
				n = -n;
				positive = false;
			}
			while ((n & 1) == 0) {
				n >>= 1;
				x *= x;
			}
		}
		int result = x;
		n >>= 1;
		while (n != 0) {
			x *= x;
			if ((n & 1) != 0)
				result *= x;
			n >>= 1;
		}
		
		if (positive)
			return result;
		else
			return 1.0/result;
	}

}
