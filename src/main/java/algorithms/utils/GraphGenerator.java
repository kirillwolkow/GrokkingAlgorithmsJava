package algorithms.utils;

import java.util.*;

public class GraphGenerator {
    public static Map<String, List<String>> generateEmptyGraph() {
        return new HashMap<>();
    }

    public static Map<String, List<String>> generateGraphWithAttribute() {
        Map<String, List<String>> graph = generateGraphWithoutAttribute();
        graph.replace("Claire", Arrays.asList("Thom", "Jonny", "Lena"));
        graph.put("Lena", Collections.emptyList());
        return graph;
    }

    public static Map<String, List<String>> generateGraphWithoutAttribute() {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("Kirill", Arrays.asList("Alice", "Bob", "Claire"));
        graph.put("Bob", Arrays.asList("Anuj", "Peggy"));
        graph.put("Alice", Arrays.asList("Peggy"));
        graph.put("Claire", Arrays.asList("Thom", "Jonny"));
        graph.put("Anuj", Collections.emptyList());
        graph.put("Peggy", Collections.emptyList());
        graph.put("Thom", Collections.emptyList());
        graph.put("Jonny", Collections.emptyList());
        return graph;
    }
}
