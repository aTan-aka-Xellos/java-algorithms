package algorithms.numbers.bits;

import static algorithms.Assert.assertEquals;

/**
 * Generate pseudo-random numbers using XOR.
 * https://www.javamex.com/tutorials/random_numbers/xorshift.shtml
 * https://en.wikipedia.org/wiki/Xorshift
 * https://habr.com/post/183462
 */
public class XORShift {

    public static long getRandom(long seed) {
        seed = seed ^ seed <<  21;
        seed = seed ^ seed >>> 35;
        return seed ^ seed << 4;
    }

    public static void main(String[] args) {

        assertEquals(getRandom(5L), 178258005L);
        assertEquals(getRandom(178258005L), 5651489766934405L);
        assertEquals(getRandom(5651489766934405L), -9127299601691290113L);
        assertEquals(getRandom(-9127299601691290113L),146455018630021125L);
        assertEquals(getRandom(146455018630021125L), 2104002940825447L);
    }

}