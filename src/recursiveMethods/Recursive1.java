package recursiveMethods;

public class Recursive1 {
	public double recursive_1(int x, int n) {
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
		else if (n < 0) {
			return 1.0/x * recursive_1(x, n + 1);			
		}
		else {
			return x * recursive_1(x, n - 1);
		}
	}

}
