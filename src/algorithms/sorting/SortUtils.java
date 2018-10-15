package algorithms.sorting;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * This class contains useful utility and short-cut methods to work with sorting.
 *
 * @author aTan-aka-Xellos (https://github.com/aTan-aka-Xellos)
 *
 */
public final class SortUtils {

    private SortUtils() {}

    /**
     * Method to swap 2 elements in the array.
     * @param a given array
     * @param idx index of the first element
     * @param idy index of the second element
     *
     */
    public static <T> void swap(T[] a, int idx, int idy) {
        T buffer = a[idx];
        a[idx] = a[idy];
        a[idy] = buffer;
    }

    /**
     * Print given array.
     * @param a array to print
     *
     */
    public static <T> void print(T[] a) {
        System.out.println(Arrays.toString(a));
    }

    /**
     * Method to create string of all array elements, separated by space.
     * @param a given array
     * @return string representation of the given array
     *
     */
    public static <T> String toString(T[] a) {
        StringJoiner joiner = new StringJoiner("\u0020");

        Arrays.stream(a)
            .map(Object::toString)
            .forEach(joiner::add);

        return joiner.toString();
    }

    /**
     * Short-cut method to copy array.
     * @param a the array to copy
     * @return copy of the given array
     *
     */
    public static <T> T[] copy(T[] a) {
        return Arrays.copyOf(a, a.length);
    }

    /**
     * Method for testing purpose - to create reference (expected) example of sorted array.
     * @param a the array to be sorted
     * @return sorted array
     *
     */
    public static <T> T[] referenceSort(T[] a) {
        Arrays.sort(a);
        return a;
    }

}
