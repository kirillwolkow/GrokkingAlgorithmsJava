package algorithms.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static algorithms.utils.ArrayListGenerator.generateRandomArrayList;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class QuickSortTest {

    private Stream<Arguments> parametersForSort() {
        Collection<Integer> smallList = generateRandomArrayList(25);
        List<Integer> smallListSorted = new ArrayList<>(smallList);
        Collections.sort(smallListSorted);
        Collection<Integer> mediumList = generateRandomArrayList(100);
        List<Integer> mediumListSorted = new ArrayList<>(mediumList);
        Collections.sort(mediumListSorted);
        Collection<Integer> largeList = generateRandomArrayList(1000);
        List<Integer> largeListSorted = new ArrayList<>(largeList);
        Collections.sort(largeListSorted);

        return Stream.of(
                arguments(smallListSorted, smallList),
                arguments(mediumListSorted, mediumList),
                arguments(largeListSorted, largeList)
        );
    }

    @ParameterizedTest
    @MethodSource("parametersForSort")
    void sort(final Collection<Integer> expected, final Collection<Integer> array) {
        Assertions.assertEquals(expected.size(), QuickSort.sort(array).size());
        Assertions.assertIterableEquals(expected, QuickSort.sort(array));
    }
}