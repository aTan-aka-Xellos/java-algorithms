package algorithms.numbers;

/**
 * https://en.wikipedia.org/wiki/Prime_number
 *
 * Based on answer:
 * https://stackoverflow.com/questions/9625663#9704912
 */
public class PrimesTrialDivision {

    public static boolean isPrime(long n) {

        if (n == 1) return false;

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

}
