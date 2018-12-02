package algorithms.numbers;

import static algorithms.Assert.assertEquals;
import static algorithms.Assert.assertTrue;
import static java.util.Arrays.copyOf;
import static java.util.Arrays.fill;

import java.math.BigInteger;

/**
 * Sieve Of Eratosthenes implementation.
 * Some optimisations weren't applied to simplify the code.
 * 
 * https://en.wikipedia.org/wiki/Prime_number
 * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 */
public class SieveOfEratosthenes {

    public static int[] getPrimes(int maxNumber) {
        if (maxNumber < 2) return new int[] {};

        boolean[] isPrime = new boolean[maxNumber + 1];
        fill(isPrime, 2, isPrime.length, true);

        for (int i = 2; i * i <= maxNumber; i++) {
            if (isPrime[i]) {
                int limit = maxNumber / i;
                for (int factor = i; factor <= limit; factor++) {
                    isPrime[i * factor] = false;
                }
            }
        }

        int count = 0;
        int[] primes = new int[countPrimesUpperBound(maxNumber)];

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) primes[count++] = i;
        }

        return copyOf(primes, count);
    }

    /**
     * Calculate approximate primes upper bound - http://mathworld.wolfram.com/PrimeCountingFunction.html
     * @param max number to search for primes
     * @return upper bound for primes
     */
    private static int countPrimesUpperBound(int max) {
        return max > 1 ? (int)(1.25506 * max / Math.log(max)) : 0;
    }

    /**
     * Test using BigInteger.isProbablePrime(1) as reference method to check is number is prime.
     */
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int[] primes = getPrimes(i);
            for (int prime : primes) {
                assertTrue(BigInteger.valueOf(prime).isProbablePrime(1), prime + " is not prime");
            }
        }

        assertEquals(getPrimes(-10),  new int[]{});
        assertEquals(getPrimes(-3),   new int[]{});

        assertEquals(getPrimes(0),  new int[]{});
        assertEquals(getPrimes(1),  new int[]{});
        assertEquals(getPrimes(2),  new int[]{2});
        assertEquals(getPrimes(10), new int[]{2, 3, 5, 7});
        assertEquals(getPrimes(13), new int[]{2, 3, 5, 7, 11, 13});

        // 7919 is the 1000-th prime number
        assertEquals(getPrimes(7919).length,  1000);
        assertEquals(getPrimes(7920).length,  1000);
    }
}

