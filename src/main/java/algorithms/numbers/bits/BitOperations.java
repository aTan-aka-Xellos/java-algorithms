package algorithms.numbers.bits;

import static algorithms.Assert.assertEquals;
import static java.lang.Integer.toBinaryString;

public class BitOperations {


    public static int getBit(int number, int bitPosition) {
        return (number >> bitPosition) & 1;
    }

    public static int setBit(int number, int bitPosition) {
        int mask = 1 << bitPosition;
        return number | mask;
    }

    public static int clearBit(int number, int bitPosition) {
        int mask = ~(1 << bitPosition);
        return number & mask;
    }

    public static void main(String[] args) {

        // setBit
        assertEquals(toBinaryString(setBit(0b110, 0)), "111");
        assertEquals(toBinaryString(setBit(0b100, 1)), "110");
        assertEquals(toBinaryString(setBit(0b001, 3)), "1001");
        assertEquals(toBinaryString(setBit(0b001, 31)), "10000000000000000000000000000001");

        // getBit
        assertEquals(toBinaryString(getBit(0b111, 0)), "1");
        assertEquals(toBinaryString(getBit(0b111, 1)), "1");
        assertEquals(toBinaryString(getBit(0b111, 2)), "1");
        assertEquals(toBinaryString(getBit(0b111, 3)), "0");
        assertEquals(toBinaryString(getBit(0b101, 1)), "0");

        // clearBit
        assertEquals(toBinaryString(clearBit(0b111, 0)), "110");
        assertEquals(toBinaryString(clearBit(0b111, 1)), "101");
        assertEquals(toBinaryString(clearBit(0b111, 2)), "11");
        assertEquals(toBinaryString(clearBit(0b111, 3)), "111");

        assertEquals(toBinaryString(clearBit(0b10000000_00000000_00000000_00000001, 0)),
            "10000000000000000000000000000000");
        assertEquals(toBinaryString(clearBit(0b10000000_00000000_00000000_11111111, 7)),
            "10000000000000000000000001111111");
        assertEquals(toBinaryString(clearBit(0b10000000_00000000_00000000_00000001, 31)),
            "1");
    }
}
