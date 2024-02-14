package algorithms.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static algorithms.utils.ArrayListGenerator.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SelectionSortTest {

    private Stream<Arguments> parametersForFindSmallest() {
        Collection<Integer> smallList = generateSmallArrayList();
        Collection<Integer> mediumList = generateMediumArrayList();
        Collection<Integer> largeList = generateLargeArrayList();
        Collection<Integer> customList = generateArrayList(100000000);
        Collection<Integer> randomList = new ArrayList<>();
        randomList.add(5);
        randomList.add(15);
        randomList.add(44);
        randomList.add(31);
        randomList.add(1);

        return Stream.of(
                arguments(0, smallList),
                arguments(0, mediumList),
                arguments(0, largeList),
                arguments(0, customList),
                arguments(4, randomList)
        );
    }

    @ParameterizedTest
    @MethodSource("parametersForFindSmallest")
    void findSmallest(final int expected, final Collection<Integer> array) {
        Assertions.assertEquals(expected, SelectionSort.findSmallest(array));
    }

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
        Assertions.assertEquals(expected.size(), SelectionSort.sort(array).size());
        Assertions.assertIterableEquals(expected, SelectionSort.sort(array));
    }
}