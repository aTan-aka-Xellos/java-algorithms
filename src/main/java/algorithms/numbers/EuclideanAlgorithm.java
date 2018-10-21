package algorithms.numbers;

import static algorithms.Assert.assertEquals;
import static java.lang.Math.abs;

/**
 * https://en.wikipedia.org/wiki/Greatest_common_divisor
 * https://en.wikipedia.org/wiki/Euclidean_algorithm
 */
public class EuclideanAlgorithm {

    /**
     * The greatest common divisor  of two nonzero numbers a and b.
     * But it is convenient to set gcd(0, 0) = 0 (c) Wiki
     * @return greatest common divisor
     */
    public static long gcd(long a, long b) {
        a = abs(a);
        b = abs(b);

        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {

        assertEquals(gcd(0, 0), 0); // exceptional case
        assertEquals(gcd(1, 0), 1);
        assertEquals(gcd(8, 0), 8);
        assertEquals(gcd(1, 1), 1);
        assertEquals(gcd(3, 27), 3);
        assertEquals(gcd(13, 100), 1);
        assertEquals(gcd(89, 144), 1);
        assertEquals(gcd(77, 999), 1);
        assertEquals(gcd(10, 100), 10);
        assertEquals(gcd(10, -100), 10);
        assertEquals(gcd(0, -117), 117);
        assertEquals(gcd(-177, 0), 177);
        assertEquals(gcd(-10, -100), 10);
        assertEquals(gcd(-462, 1071), 21);
    }
}
