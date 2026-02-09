package cp213;

/**
 * @author Muqadas Nazif, 169061218
 * @version 2025-01-05
 */
public class Numbers {

    /**
     * Determines closest value of two values to a target value.
     *
     * @param target the target value
     * @param v1     first comparison value
     * @param v2     second comparison value
     * @return one of v1 or v2 that is closest to target, v1 is the value chosen if
     *         v1 and v2 are an equal distance from target
     */
    public static double closest(final double target, final double v1, final double v2) {
    	double t1 = v1 -target;
    	double t2 = v2-target;
    	if (t1<0) t1 = -t1;
    	if (t2<0) t2 = -t2;
    	if (t1==t2) {
    		return v1;
    	}
    	if (t1<t2) {
    		return v1;
    	} else {
    		return v2;
    	}
    }

    /**
     * Determines if n is a prime number. Prime numbers are whole numbers greater
     * than 1, that have only two factors - 1 and the number itself. Prime numbers
     * are divisible only by the number 1 or itself.
     *
     * @param n an integer
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(final int n) {
    	if (n<=1) {
    		return false;
    	} 
    	if (n==2) {
    		return true;
    	}
    	if (n%2==0) {
    		return false;
    	}
    	for (int i= 3; i * i <=n; i +=2) {
    		if (n % i ==0) {
    			return false;
    	}
    }
    return true;
}

    /**
     * Sums and returns the total of a partial harmonic series. This series is the
     * sum of all terms 1/i, where i ranges from 1 to n (inclusive). Ex:
     *
     * n = 3: sum = 1/1 + 1/2 + 1/3 = 1.8333333333333333
     *
     * @param n an integer
     * @return sum of partial harmonic series from 1 to n
     */
    public static double sumPartialHarmonic(final int n) {
    	double sum = 0.0;
    	for (int i=1; i<=n; i++) {
    		sum += 1.0/i;
    	}
	return sum;
    }
}
