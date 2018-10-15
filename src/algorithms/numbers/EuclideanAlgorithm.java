package algorithms.numbers;

import static algorithms.Assert.assertEquals;

/**
 * https://en.wikipedia.org/wiki/Greatest_common_divisor
 * https://en.wikipedia.org/wiki/Euclidean_algorithm
 */
public class EuclideanAlgorithm {

    /**
     * The greatest common divisor  of two nonzero numbers a and b
     * @return greatest common divisor
     */
    public static long GCD(long a, long b) {
        if (a == 0 && b == 0) throw new IllegalArgumentException("One of the arguments should be nonzero");

        a = Math.abs(a);
        b = Math.abs(b);

        return b == 0 ? a : GCD(b, a % b);
    }

    public static void main(String[] args) {

        assertEquals(GCD(1, 0), 1);
        assertEquals(GCD(1, 1), 1);
        assertEquals(GCD(3, 27), 3);
        assertEquals(GCD(13, 100), 1);
        assertEquals(GCD(89, 144), 1);
        assertEquals(GCD(77, 999), 1);
        assertEquals(GCD(10, 100), 10);
        assertEquals(GCD(10, -100), 10);
        assertEquals(GCD(-10, -100), 10);
        assertEquals(GCD(-462, 1071), 21);
    }
}
