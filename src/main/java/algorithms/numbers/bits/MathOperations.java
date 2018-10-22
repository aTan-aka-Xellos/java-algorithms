package algorithms.numbers.bits;

import static algorithms.Assert.assertEquals;
import static algorithms.Assert.assertFalse;
import static algorithms.Assert.assertTrue;

/**
 * Purpose of this class is to show some examples of basic math operations using bitwise operators.
 */
public class MathOperations {

    public static boolean isEven(int value) {
        return (value & 1) == 0;
    }

    public static int multiplyByTwo(int value) {
        return value << 1;
    }

    public static int divideByTwo(int value) {
        return value >> 1;
    }

    public static boolean isPositive(int value) {
        if (value == 0) return false;

        return (value >> 31) == 0;
    }

    public static int switchSign(int value) {
        return ~ value + 1;
    }

    public static void main(String[] args) {

        // isEven
        assertTrue(isEven(0),      "0 is even");
        assertTrue(isEven(2),      "2 is even");
        assertTrue(isEven(10),     "10 is even");
        assertTrue(isEven(0b110),  "6 is even");
        assertTrue(isEven(99998),  "99998 is even");
        assertTrue(isEven(-99998), "-99998 is even");
        assertTrue(isEven(Integer.MIN_VALUE), Integer.MIN_VALUE + " is even");

        assertFalse(isEven(1),      "1 is odd");
        assertFalse(isEven(13),     "13 is odd");
        assertFalse(isEven(0b111),  "7 is odd");
        assertFalse(isEven(-99997), "99998 is odd");
        assertFalse(isEven(Integer.MAX_VALUE), Integer.MAX_VALUE + " is not odd");
        assertFalse(isEven(0b11111111_11111111_11111111_11111011), "-5 is odd");

        // multiplyByTwo
        assertEquals(multiplyByTwo(0), 0);
        assertEquals(multiplyByTwo(1), 2);
        assertEquals(multiplyByTwo(2), 4);
        assertEquals(multiplyByTwo(-27), -54);
        assertEquals(multiplyByTwo(330), 660);

        // divideByTwo
        assertEquals(divideByTwo(0), 0);
        assertEquals(divideByTwo(1), 0);
        assertEquals(divideByTwo(2), 1);
        assertEquals(divideByTwo(10), 5);
        assertEquals(divideByTwo(13), 6);
        assertEquals(divideByTwo(-20), -10);
        assertEquals(divideByTwo(-101), -51);

        // isPositive
        assertTrue(isPositive(1), "1 is positive");
        assertTrue(isPositive(999), "1 is positive");
        assertTrue(isPositive(Integer.MAX_VALUE), Integer.MAX_VALUE + " is positive");

        assertFalse(isPositive(0), "0 neither positive neither negative");

        assertFalse(isPositive(-1), "-1 is negative");
        assertFalse(isPositive(-13), "-1 is negative");
        assertFalse(isPositive(Integer.MIN_VALUE), Integer.MIN_VALUE + " is negative");
        assertFalse(isPositive(0b11111111_11111111_11111111_11111111), "-1 is negative");
        assertFalse(isPositive(0b10000000_00000000_00000000_00000000), "-2147483648 is negative");

        // switchSign
        assertEquals(switchSign(1), -1);
        assertEquals(switchSign(10), -10);
        assertEquals(switchSign(999), -999);
        assertEquals(switchSign(Integer.MAX_VALUE), -2147483647);
        assertEquals(switchSign(0b01111111_11111111_11111111_11111111), -2147483647);

        assertEquals(switchSign(-1), 1);
        assertEquals(switchSign(-10), 10);
        assertEquals(switchSign(-999), 999);
        assertEquals(switchSign(-Integer.MAX_VALUE), 2147483647);
        assertEquals(switchSign(0b10000000_00000000_00000000_00000001), 2147483647);

        // exception: 2147483647 + 1 = -2147483648
        assertEquals(switchSign(Integer.MIN_VALUE), Integer.MIN_VALUE);
    }
}
