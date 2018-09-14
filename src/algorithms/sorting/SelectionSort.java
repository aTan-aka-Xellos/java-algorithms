package algorithms.sorting;

import static algorithms.sorting.SortUtils.print;

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

    private static <T extends Comparable<? super T>> void swap(T[] array, int idx, int idy) {
        T buffer = array[idx];
        array[idx] = array[idy];
        array[idy] = buffer;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{5, 4, 3, 2, 1, 0};

        sort(array);
        print(array);
    }
}
