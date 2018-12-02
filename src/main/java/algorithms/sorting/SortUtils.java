package algorithms.sorting;

import java.util.Arrays;

/**
 * This class contains useful utility and short-cut methods to work with sorting.
 *
 * @author aTan-aka-Xellos (https://github.com/aTan-aka-Xellos)
 *
 */
public final class SortUtils {

    private SortUtils() {}

    /**
     * Swap 2 elements in the array.
     * @param a given array
     * @param idx index of the first element
     * @param idy index of the second element
     */
    public static void swap(int[] a, int idx, int idy) {
        int buffer = a[idx];
        a[idx] = a[idy];
        a[idy] = buffer;
    }

    /**
     * Print given array.
     * @param a array to print
     */
    public static void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    /**
     * Short-cut method to copy an array.
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
     */
    public static int[] referenceSort(int[] a) {
        Arrays.sort(a);
        return a;
    }

    /**
     * Check if array is fully sorted by asc order.
     * @param a giver array to check if sorted.
     * @return true, if array is sorted by asc, false - otherwise
     */
    public static boolean isSorted(int[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    /**
     * Check if sub-array (defined by given interval) is fully sorted by asc order.
     * @param a giver array to check if sorted on given interval.
     * @param lo first index of interval
     * @param hi last  index of interval
     * @return true, if array is sorted by asc, false - otherwise
     */
    public static boolean isSorted(int[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            if (a[i] < a[i - 1]) return false;
        }
        return true;
    }

}
