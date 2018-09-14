package algorithms.sorting;

public class Assert {

    private Assert() {}

    static <T extends Comparable<? super T>> void assertEquals(T[] actual, T[] expected) {
        if (actual.length != expected.length) throw new AssertionError("Arrays length doesn't match");
        if (actual.getClass() != expected.getClass()) throw new AssertionError("Classes doesn't match");

        for (int i = 0; i < actual.length; i++) {
            if (actual[i].compareTo(expected[i]) != 0)
                throw new AssertionError(
                    "\nActual:   " + SortUtils.toString((actual)) +
                    "\nExpected: " + SortUtils.toString((expected)));
        }
    }
}
