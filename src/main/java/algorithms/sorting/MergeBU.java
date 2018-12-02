package algorithms.sorting;

import static algorithms.Assert.assertEquals;
import static algorithms.sorting.SortUtils.isSorted;
import static algorithms.sorting.SortUtils.print;
import static algorithms.sorting.SortUtils.referenceSort;
import static java.lang.Math.min;
import static java.util.Arrays.copyOf;

/**
 * Bottom-up Merge sort algorithm without recursion.
 * As reference used:
 * @see <a href="https://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/MergeBU.java.html>
 */
public class MergeBU {

    public static void sort(int[] a) {

        int n = a.length;
        int[] aux = new int[n];

        for (int sz = 1; sz < n; sz *= 2) {
            for (int lo = 0; lo < n - sz; lo += 2 * sz) {
                int mid = lo + sz - 1;
                int hi = min(lo + 2 * sz - 1, n - 1);
                merge(a, aux, lo, mid, hi);
            }
        }

        assert isSorted(a);
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
        int[] array = {2, 5, 5, 1, 6, 0, 4, 3};
        int[] copy  = copyOf(array, array.length);

        sort(array);
        print(array);
        assertEquals(array, referenceSort(copy));

        array = new int[]{6, 5, 4, 3, 2, 1, 0};
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
