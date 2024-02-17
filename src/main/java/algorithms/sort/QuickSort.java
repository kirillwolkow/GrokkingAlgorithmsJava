package algorithms.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {
    /**
     * Returns a new array which is sorted in ascending order.
     * */
    public static Collection<Integer> sort(final Collection<Integer> array) {
        ArrayList<Integer> list = new ArrayList<>(array);
        if (list.size() < 2) {
            return list;
        } else {
            Integer pivot = list.getFirst();
            List<Integer> less = list.stream().skip(1).filter(element -> element <= pivot).toList();
            List<Integer> greater = list.stream().skip(1).filter(element -> element > pivot).toList();

            return Stream.of(
                    sort(less).stream(),
                    Stream.of(pivot),
                    sort(greater).stream()).flatMap(Function.identity()).collect(Collectors.toList());
        }
    }
}
