package algorithms.numbers;

import static algorithms.Assert.assertEquals;
import static algorithms.Assert.assertTrue;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * https://en.wikipedia.org/wiki/Prime_number
 * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 */
public class SieveOfEratosthenes {

    public static int[] getPrimes(int n) {
        if (n < 2) return new int[] {};

        boolean[] sieved = new boolean[n + 1];
        int limit = (int) Math.sqrt(n);

        for (int i = 3; i <= limit; i += 2) {
            if (!sieved[i]) {
                int maxToCheck = n / i;
                for (int j = i; j <= maxToCheck; j++) {
                    sieved[i * j] = true;
                }
            }
        }

        int[] primes = new int[n];
        int count = 1;
        primes[0] = 2;
        for (int i = 3; i < sieved.length; i += 2) {
            if (!sieved[i]) primes[count++] = i;
        }

        return Arrays.copyOf(primes, count);
    }

    /**
     * Test using BigInteger.isProbablePrime(1) as reference method to check is number is prime.
     */
    public static void main(String[] args) {

//        Arrays.stream(getPrimes(13)).forEach(System.out::println);

        for (int i = 0; i < 100; i++) {
            int[] primes = getPrimes(i);
            for (int prime : primes) {
                assertTrue(BigInteger.valueOf(prime).isProbablePrime(1), prime + " is not prime");
            }
        }

        assertEquals(getPrimes(0),  new int[]{});
        assertEquals(getPrimes(1),  new int[]{});
        assertEquals(getPrimes(2),  new int[]{2});
        assertEquals(getPrimes(10), new int[]{2, 3, 5, 7});
        assertEquals(getPrimes(13), new int[]{2, 3, 5, 7, 11, 13});
    }
}

