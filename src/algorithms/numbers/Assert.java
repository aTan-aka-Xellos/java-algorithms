package algorithms.numbers;


public class Assert {

    private Assert() {}

    static void assertEquals(int actual, int expected) {
        if (actual != expected) {
            throw new AssertionError("\nActual:   " + actual + "\nExpected: " + expected);
        }
    }

    static void assertEquals(long actual, long expected) {
        if (actual != expected) {
            throw new AssertionError("\nActual:   " + actual + "\nExpected: " + expected);
        }
    }

    static void assertTrue(boolean statement, String message) {
        if (!statement) {
            throw new AssertionError("\nStatement is not true: " + message);
        }
    }

}
