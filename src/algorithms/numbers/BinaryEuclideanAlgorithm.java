package algorithms.numbers;

import static algorithms.Assert.assertEquals;
import static java.lang.Math.abs;

/**
 * The binary gcd algorithm, also known as Stein's algorithm,
 * is an algorithm that computes the greatest common divisor of two non negative integers
 * https://en.wikipedia.org/wiki/Greatest_common_divisor
 * https://en.wikipedia.org/wiki/Binary_GCD_algorithm
 *
 * Implementation taken from:
 * https://ru.wikibooks.org/wiki/Реализации_алгоритмов/Бинарный_алгоритм_вычисления_НОД
 */
public class BinaryEuclideanAlgorithm {

    /**
     * The greatest common divisor  of two nonzero numbers a and b.
     * But it is convenient to set gcd(0, 0) = 0 (c) Wiki
     * @return greatest common divisor
     */
    public static long gcd(long a, long b) {

        a = abs(a);
        b = abs(b);

        if (a == 0) return b;
        if (b == 0 || a == b) return a;

        if ((a & 1) == 0) {                // if a even:
            return ((b & 1) == 0)
                ? gcd(a >> 1, b >> 1) << 1 // if b even: gcd(a, b) = 2 * gcd(a/2, b/2)
                : gcd(a >> 1, b);          // if b odd:  gcd(a, b) = gcd(a/2, b)
        } else                             // if a odd:
            return ((b & 1) == 0)
                ? gcd(a, b >> 1)           // if b even: gcd(a ,b) = gcd(a, b/2)
                : gcd(b, abs(a - b));      // if b odd:  gcd(a, b) = gcd(b, |a - b|)
    }

    public static void main(String[] args) {

        assertEquals(gcd(0, 0), 0); // exceptional case
        assertEquals(gcd(1, 0), 1);
        assertEquals(gcd(8, 0), 8);
        assertEquals(gcd(1, 1), 1);
        assertEquals(gcd(3, 27), 3);
        assertEquals(gcd(11, 100), 1);
        assertEquals(gcd(89, 144), 1);
        assertEquals(gcd(77, 999), 1);
        assertEquals(gcd(10, 100), 10);
        assertEquals(gcd(10, -100), 10);
        assertEquals(gcd(-10, 100), 10);
        assertEquals(gcd(0, -117), 117);
        assertEquals(gcd(-177, 0), 177);
        assertEquals(gcd(-10, -100), 10);
        assertEquals(gcd(-462, 1071), 21);
    }
}
