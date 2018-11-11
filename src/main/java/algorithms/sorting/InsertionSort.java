package algorithms.sorting;

import static algorithms.Assert.assertEquals;
import static algorithms.sorting.SortUtils.*;

public class InsertionSort {

    public static <T extends Comparable<? super T>> void sort(T[] array) {

        int N = array.length;

        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && (less(array[j], array[j - 1])); j--) {
                swap(array, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {6, 5, 4, 3, 2, 1, 0};
        Integer[] copy = copy(array);

        sort(array);
        print(array);
        assertEquals(array, referenceSort(copy));

        array = new Integer[]{2, 5, 1, 6, 0, 4, 3};
        copy  = copy(array);

        sort(array);
        print(array);
        assertEquals(array, referenceSort(copy));
    }
}
