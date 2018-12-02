package algorithms.sorting;

import static algorithms.Assert.assertEquals;

import static algorithms.sorting.SortUtils.isSorted;
import static algorithms.sorting.SortUtils.print;
import static algorithms.sorting.SortUtils.referenceSort;
import static java.util.Arrays.copyOf;

/**
 * Classic Merge sort algorithm with recursion.
 * Reference taken from:
 * @see <a href="https://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/Merge.java.html>
 */
public class MergeSort {

    public static void sort(int[] a) {

        int[] aux = new int[a.length];
        sort(a, aux, 0, a.length - 1);

        assert isSorted(a);
    }

    private static void sort(int[] a, int[] aux, int lo, int hi) {

        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;

        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }


    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {

        assert isSorted(a, lo, mid);
        assert isSorted(a, mid + 1, hi);

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

                 if (i > mid)         a[k] = aux[j++];
            else if (j > hi)          a[k] = aux[i++];
            else if (aux[j] < aux[i]) a[k] = aux[j++];
            else                      a[k] = aux[i++];
        }

        assert isSorted(a, lo, hi);
    }

    public static void main(String[] args) {
        int[] array = {6, 5, 4, 3, 2, 1, 0};
        int[] copy  = copyOf(array, array.length);

        sort(array);
        print(array);
        assertEquals(array, referenceSort(copy));

        array = new int[]{2, 5, 5, 1, 6, 0, 4, 3};
        copy  = copyOf(array, array.length);

        sort(array);
        print(array);
        assertEquals(array, referenceSort(copy));

        array = new int[]{1, 1, 2, 2, 3, 4};
        copy  = copyOf(array, array.length);

        sort(array);
        print(array);
        assertEquals(array, referenceSort(copy));
    }
}
