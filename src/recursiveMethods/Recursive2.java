package recursiveMethods;

public class Recursive2 {
	public double recursive_2(int x, int n) {
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
			if (n % 2 == 0) {
				return recursive_2(x, n/2) * recursive_2(x, n/2);
			}
			else {				
				return 1.0/x * recursive_2(x, n/2) * recursive_2(x, n/2);			
			}
		}
		else {
			if (n % 2 == 0) {
				return recursive_2(x, n/2) * recursive_2(x, n/2);				
			}
			else {
				return x * recursive_2(x, n/2) * recursive_2(x, n/2);
			}
		}
	}

}
