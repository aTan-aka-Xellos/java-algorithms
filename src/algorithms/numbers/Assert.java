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

    static void assertTrue(boolean expression) {
        if (!expression) {
            throw new AssertionError("\nStatement is not true!");
        }
    }

}
