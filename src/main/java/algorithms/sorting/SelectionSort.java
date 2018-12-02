package algorithms.sorting;

import static algorithms.Assert.assertEquals;
import static algorithms.sorting.SortUtils.print;
import static algorithms.sorting.SortUtils.referenceSort;
import static algorithms.sorting.SortUtils.swap;
import static java.util.Arrays.copyOf;

public class SelectionSort {

    public static void sort(int[] array) {

        int N = array.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (array[j] < array[min]) min = j;
            }
            swap(array, i, min);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 3, 2, 1, 0};
        int[] copy  = copyOf(array, array.length);

        sort(array);
        print(array);
        assertEquals(array, referenceSort(copy));

        array = new int[]{2, 5, 1, 0, 4, 3};
        copy  = copyOf(array, array.length);

        sort(array);
        print(array);
        assertEquals(array, referenceSort(copy));
    }
}
