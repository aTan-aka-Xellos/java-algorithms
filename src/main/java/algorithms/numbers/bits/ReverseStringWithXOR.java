package algorithms.numbers.bits;

import static algorithms.Assert.assertEquals;

/**
 * Reverse String using XOR.
 * Source: https://habr.com/post/183462
 */
public class ReverseStringWithXOR {

    public static String reverseWithXOR(String string) {

        char[] c = string.toCharArray();
        int n = c.length;

        int mid = (int) Math.floor(n / 2);
        for (int i = 0; i < mid; i++) {

            c[i]         ^= c[n - i - 1];
            c[n - i - 1] ^= c[i];
            c[i]         ^= c[n - i - 1];
        }
        return new String(c);
    }

    public static void main(String[] args) {

        assertEquals(reverseWithXOR("a"), "a");
        assertEquals(reverseWithXOR("ab"), "ba");
        assertEquals(reverseWithXOR("abcd"), "dcba");
        assertEquals(reverseWithXOR("abcde"), "edcba");
        assertEquals(reverseWithXOR("1a2b3c"), "c3b2a1");
        assertEquals(reverseWithXOR("1a2b3c4"), "4c3b2a1");
    }
}
