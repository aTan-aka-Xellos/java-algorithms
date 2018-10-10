package algorithms.numbers;

/**
 * https://en.wikipedia.org/wiki/Greatest_common_divisor
 */
public class EuclideanAlgorithm {

    /**
     * Euclidean algorithm.
     * https://en.wikipedia.org/wiki/Euclidean_algorithm
     */
    private static long GCD(long a, long b) {
        return b == 0 ? a : GCD(b, a%b);
    }

    public static void main(String[] args) {
    }
}
