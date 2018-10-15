package algorithms.numbers;

import static algorithms.numbers.Assert.assertTrue;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * https://en.wikipedia.org/wiki/Prime_number
 * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 */
public class SieveOfEratosthenes {

    public static int[] getPrimes(int n) {
        if (n < 2) return new int[] {};

        boolean[] sieved = new boolean[n];
        int limit = (int) Math.sqrt(n);

        for (int i = 3; i < limit; i += 2) {
            if (!sieved[i]) {
                for (int j = i; i * j < n; j++) {
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
     * @param args
     */
    public static void main(String[] args) {

        // Arrays.stream(primes).forEach(System.out::println);

        for (int i = 0; i < 100; i++) {
            int[] primes = getPrimes(i);
            for (int prime : primes) {
                assertTrue(BigInteger.valueOf(prime).isProbablePrime(1));
            }
        }
    }
}

