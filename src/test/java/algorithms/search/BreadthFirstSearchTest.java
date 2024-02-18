package algorithms.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static algorithms.utils.GraphGenerator.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BreadthFirstSearchTest {

    private Stream<Arguments> parametersForSearch() {
        Map<String, List<String>> emptyGraph = generateEmptyGraph();
        Map<String, List<String>> successGraph = generateGraphWithAttribute();
        Map<String, List<String>> failGraph = generateGraphWithoutAttribute();

        return Stream.of(
                arguments(false, "Kirill", emptyGraph),
                arguments(true, "Kirill", successGraph),
                arguments(false, "Kirill", failGraph)
        );
    }

    @ParameterizedTest
    @MethodSource("parametersForSearch")
    void search(final boolean expected, final String name, final Map<String, List<String>> graph) {
        Assertions.assertEquals(expected, BreadthFirstSearch.search(name, graph));
    }
}
