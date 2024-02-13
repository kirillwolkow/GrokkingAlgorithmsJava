package algorithms.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static algorithms.utils.ArrayGenerator.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BinarySearchTest {
    private Stream<Arguments> parametersForGetIndex() {
        int[] smallList = generateSmallList();
        int[] mediumList = generateMediumList();
        int[] largeList = generateLargeList();
        int[] customList = generateList(100000000);

        return Stream.of(
                arguments(4, smallList, 8),
                arguments(1, smallList, 2),
                arguments(-1, smallList, 100),
                arguments(24, mediumList, 25),
                arguments(11, mediumList, 12),
                arguments(-1, mediumList, 100),
                arguments(98, largeList, 99),
                arguments(3, largeList, 4),
                arguments(-1, largeList, 2000),
                arguments(1999, customList, 2000),
                arguments(9999998, customList, 9999999),
                arguments(-1, customList, 100000001)
        );
    }


    @ParameterizedTest
    @MethodSource("parametersForGetIndex")
    void getIndex(final int expected, final int[] list, final int item) {
        Assertions.assertEquals(expected, BinarySearch.getIndex(list, item));
    }
}