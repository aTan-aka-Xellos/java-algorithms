package algorithms.sorting;

import static algorithms.Assert.assertEquals;
import static algorithms.sorting.SortUtils.*;

public class SelectionSort {

    public static <T extends Comparable<? super T>> void sort(T[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }


    public static void main(String[] args) {
        Integer[] array = {5, 4, 3, 2, 1, 0};
        Integer[] copy = copy(array);

        sort(array);
        print(array);

        assertEquals(array, referenceSort(copy));
    }
}
