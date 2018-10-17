package algorithms.numbers;

import static algorithms.Assert.assertFalse;
import static algorithms.Assert.assertTrue;

/**
 * https://en.wikipedia.org/wiki/Prime_number
 *
 * Based on answer:
 * https://stackoverflow.com/questions/9625663#9704912
 */
public class PrimesTrialDivision {

    public static boolean isPrime(long n) {

        if (n < 2) return false;

        long limit = (long) Math.sqrt(n);
        for (long i = 2; i <= limit; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static long findLargestPrime(long n) {
        if (n < 2) throw new IllegalArgumentException();

        long largestPrime = 2;
        for (long i = 3; i <= n; i++) {
            if (isPrime(i)) {
                largestPrime = i;
            }
        }
        return largestPrime;
    }

    public static void main(String[] args) {

        assertFalse(isPrime(-13), "-13 not a prime number");
        assertFalse(isPrime(-3), "-3 not a prime number");
        assertFalse(isPrime(-2), "-2 not a prime number");
        assertFalse(isPrime(-1), "-1 not a prime number");

        assertFalse(isPrime(0), "0 not a prime number");
        assertFalse(isPrime(1), "1 not a prime number");
        assertFalse(isPrime(4), "4 not a prime number");
        assertFalse(isPrime(8), "8 not a prime number");

        assertFalse(isPrime(10),  "10 not a prime number");
        assertFalse(isPrime(124), "124 not a prime number");

        assertTrue(isPrime(2), "3 is a prime number");
        assertTrue(isPrime(3), "5 is a prime number");
        assertTrue(isPrime(5), "5 is a prime number");
        assertTrue(isPrime(97), "97 is a prime number");

        assertTrue(isPrime(7919), "7919  is a prime number");
    }

}
