package algorithms.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FactorialTest {
    private Stream<Arguments> parametersForCalculateFactorial() {
        return Stream.of(
                arguments(-1, -5),
                arguments(1, 0),
                arguments(1, 1),
                arguments(2, 2),
                arguments(6, 3),
                arguments(24, 4),
                arguments(120, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("parametersForCalculateFactorial")
    void calculateFactorial(final int expected, final int num) {
        Assertions.assertEquals(expected, Factorial.calculateFactorial(num));
    }
}