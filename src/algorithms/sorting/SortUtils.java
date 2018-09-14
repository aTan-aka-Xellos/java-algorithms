package algorithms.sorting;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * This class contains useful util methods to work with sorting.
 *
 * @author aTan-aka-Xellos (https://github.com/aTan-aka-Xellos)
 *
 */
final class SortUtils {

    private SortUtils() {}

    static <T> void print(T[] array) {
        StringJoiner joiner = new StringJoiner("\u0020");

        Arrays.stream(array)
            .map(Object::toString)
            .forEach(joiner::add);

        System.out.println(joiner.toString());
    }
}
