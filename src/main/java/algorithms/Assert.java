package algorithms;

import java.util.Arrays;

public class Assert {

    private Assert() {}

    public static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            throw new AssertionError("\nActual:   " + actual + "\nExpected: " + expected);
        }
    }

    public static void assertEquals(int actual, int expected) {
        if (actual != expected) {
            throw new AssertionError("\nActual:   " + actual + "\nExpected: " + expected);
        }
    }

    public static void assertEquals(long actual, long expected) {
        if (actual != expected) {
            throw new AssertionError("\nActual:   " + actual + "\nExpected: " + expected);
        }
    }

    public static void assertTrue(boolean statement, String message) {
        if (!statement) {
            throw new AssertionError("\nStatement is not true: " + message);
        }
    }

    public static void assertFalse(boolean statement, String message) {
        if (statement) {
            throw new AssertionError("\nStatement is not false: " + message);
        }
    }

    public static void assertEquals(int[] actual, int[] expected) {
        if (actual.length != expected.length) throw new AssertionError("Arrays length doesn't match");

        for (int i = 0; i < actual.length; i++) {
            if (actual[i] != expected[i])
                throw new AssertionError(
                    "\nActual:   " + Arrays.toString(actual) +
                    "\nExpected: " + Arrays.toString(expected));
        }
    }

    public static <T extends Comparable<? super T>> void assertEquals(T[] actual, T[] expected) {
        if (actual.length != expected.length) throw new AssertionError("Arrays length doesn't match");
        if (actual.getClass() != expected.getClass()) throw new AssertionError("Classes doesn't match");

        for (int i = 0; i < actual.length; i++) {
            if (actual[i].compareTo(expected[i]) != 0)
                throw new AssertionError(
                    "\nActual:   " + Arrays.toString(actual) +
                    "\nExpected: " + Arrays.toString(expected));
        }
    }

}
