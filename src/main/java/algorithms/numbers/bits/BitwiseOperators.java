package algorithms.numbers.bits;

import static algorithms.Assert.assertEquals;
import static java.lang.Integer.toBinaryString;

/**
 * The purpose of this class - to have straightforward examples of bitwise operation use.
 */
public class BitwiseOperators {

    /**
     * Result bit is 1 only if both given bits is 1.
     * 1 × 1 = 1
     * 1 × 0 = 0
     * 0 × 1 = 0
     * 0 × 0 = 0
     */
    public static int and(int a, int b) {
        return a & b;
    }

    /**
     * Result bit is 1 if any given bit is 1.
     * 1 × 1 = 1
     * 1 × 0 = 1
     * 0 × 1 = 1
     * 0 × 0 = 0
     */
    public static int or(int a, int b) {
        return a | b;
    }

    /**
     * Result bit is 1 only if one of given bits is 1,
     * 1 × 1 = 0
     * 1 × 0 = 1
     * 0 × 1 = 1
     * 0 × 0 = 0
     */
    public static int xor(int a, int b) {
        return a ^ b;
    }

    /**
     * Inverse bit.
     * ~1 = 0
     * ~0 = 1
     */
    public static int not(int a) {
        return ~a;
    }

    public static void main(String[] args) {

        // result bit is 1 at given index only if both bits are 1 at given index
        assertEquals(toBinaryString(and(0b1111, 0b1111)), "1111");
        assertEquals(toBinaryString(and(0b1111, 0b0011)), "11");
        assertEquals(toBinaryString(and(0b1100, 0b0011)), "0");
        assertEquals(toBinaryString(and(0b1010, 0b1111)), "1010");
        assertEquals(toBinaryString(and(0b1010, 0b0001)), "0");
        assertEquals(toBinaryString(and(0b0000, 0b1111)), "0");

        // leading bits can be replaced with 0
        assertEquals(toBinaryString(and(0b1,   0b1111)), "1");
        assertEquals(toBinaryString(and(0b11,  0b1111)), "11");
        assertEquals(toBinaryString(and(0b111, 0b1111)), "111");
        assertEquals(toBinaryString(and(0b011, 0b1110)), "10");

        // result bit is 1 if any bit of two numbers is 1 at given index
        assertEquals(toBinaryString(or(0b1111, 0b1111)), "1111");
        assertEquals(toBinaryString(or(0b1111, 0b0011)), "1111");
        assertEquals(toBinaryString(or(0b1100, 0b0011)), "1111");
        assertEquals(toBinaryString(or(0b1010, 0b1111)), "1111");
        assertEquals(toBinaryString(or(0b1010, 0b0001)), "1011");
        assertEquals(toBinaryString(or(0b0000, 0b1111)), "1111");

        // result is 1 only if one bit of two numbers if 1 at given index
        assertEquals(toBinaryString(xor(0b1111, 0b1111)), "0");
        assertEquals(toBinaryString(xor(0b1111, 0b0011)), "1100");
        assertEquals(toBinaryString(xor(0b1100, 0b0011)), "1111");
        assertEquals(toBinaryString(xor(0b1010, 0b1111)), "101");
        assertEquals(toBinaryString(xor(0b1010, 0b0001)), "1011");
        assertEquals(toBinaryString(xor(0b0000, 0b1111)), "1111");

        // int contains 32 bits, for 0b0000 it's 32 zero bits

        assertEquals(toBinaryString(not(0b0000)), "11111111111111111111111111111111");
        assertEquals(toBinaryString(not(0b0001)), "11111111111111111111111111111110");
        assertEquals(toBinaryString(not(0b0110)), "11111111111111111111111111111001");
        assertEquals(toBinaryString(not(0b1110)), "11111111111111111111111111110001");
        assertEquals(toBinaryString(not(0b1111)), "11111111111111111111111111110000");

        assertEquals(toBinaryString(not(0b11111111111111111111111111111111)), "0");
        assertEquals(toBinaryString(not(0b11111111111111111111111111111100)), "11");
        assertEquals(toBinaryString(not(0b11111111111111111111111111110101)), "1010");
    }
}