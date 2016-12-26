package recursiveMethods;

/*
 * http://stackoverflow.com/questions/26689929/power-function-using-recursion
 */

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
				double temp = recursive_2(x, n/2);
				return temp * temp;
			}
			else {				
				double temp = recursive_2(x, n/2);
				return 1.0/x * temp * temp;			
			}
		}
		else {
			if (n % 2 == 0) {
				// The complexity here is, again, O(n) rather than O(log n). 
				// Because we're calculating the powers twice.
				// return recursive_2(x, n/2) * recursive_2(x, n/2);		
				// Using several recursive calls in one step creates exponential 
				// complexity that cancels out with using a fraction of n.
				double temp = recursive_2(x, n/2);
				return temp * temp;
			}
			else {
				double temp = recursive_2(x, n/2);
				return x * temp * temp;
			}
		}
	}

}
