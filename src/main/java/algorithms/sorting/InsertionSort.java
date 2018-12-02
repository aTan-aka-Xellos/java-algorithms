package algorithms.sorting;

import static algorithms.Assert.assertEquals;
import static algorithms.sorting.SortUtils.*;
import static java.util.Arrays.copyOf;

public class InsertionSort {

    public static void sort(int[] array) {

        int N = array.length;

        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && (array[j] < array[j - 1]); j--) {
                swap(array, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 5, 4, 4, 3, 2, 1, 0};
        int[] copy  = copyOf(array, array.length);

        sort(array);
        print(array);
        assertEquals(array, referenceSort(copy));

        array = new int[]{2, 5, 1, 6, 0, 4, 3};
        copy  = copyOf(array, array.length);

        sort(array);
        print(array);
        assertEquals(array, referenceSort(copy));
    }
}
