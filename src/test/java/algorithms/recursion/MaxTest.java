package algorithms.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

import static algorithms.utils.ArrayListGenerator.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MaxTest {

    private Stream<Arguments> parametersForGetMax() {
        Collection<Integer> emptyList = new ArrayList<>();
        Collection<Integer> oneElementList = new ArrayList<>();
        oneElementList.add(1);
        Collection<Integer> smallList = generateSmallArrayList();
        Collection<Integer> mediumList = generateMediumArrayList();
        Collection<Integer> largeList = generateLargeArrayList();

        return Stream.of(
                arguments(0, emptyList),
                arguments(1, oneElementList),
                arguments(5, smallList),
                arguments(25, mediumList),
                arguments(1000, largeList)
        );
    }

    @ParameterizedTest
    @MethodSource("parametersForGetMax")
    void getMax(final int expected, final Collection<Integer> list) {
        Assertions.assertEquals(expected, Max.getMax(list));
    }
}