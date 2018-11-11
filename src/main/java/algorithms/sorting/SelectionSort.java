package algorithms.sorting;

import static algorithms.Assert.assertEquals;
import static algorithms.sorting.SortUtils.*;

public class SelectionSort {

    public static <T extends Comparable<? super T>> void sort(T[] array) {

        int N = array.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(array[j], array[min])) min = j;
            }
            swap(array, i, min);
        }
    }

    public static void main(String[] args) {
        Integer[] array = {5, 4, 3, 2, 1, 0};
        Integer[] copy = copy(array);

        sort(array);
        print(array);
        assertEquals(array, referenceSort(copy));

        array = new Integer[]{2, 5, 1, 0, 4, 3};
        copy  = copy(array);

        sort(array);
        print(array);
        assertEquals(array, referenceSort(copy));
    }
}
