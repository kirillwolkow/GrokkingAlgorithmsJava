package algorithms.search;

import java.util.*;

public class BreadthFirstSearch {
    /**
     * Checks whether a value is in the graph with a specified attribute. Returns a boolean value.
     * */
    public static boolean search(final String name, final Map<String, List<String>> graph) {
        if (graph.isEmpty() || !graph.containsKey(name)) {
            return false;
        }

        final Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));
        final List<String> searched = new ArrayList<>();

        while (!searchQueue.isEmpty()) {
            final String person = searchQueue.poll();
            if (!searched.contains(person)) {
                if (personHasAttribute(person)) {
                    return true;
                } else {
                    searchQueue.addAll(graph.get(person));
                    searched.add(person);
                }
            }
        }
        return false;
    }

    // Dummy check if person has an attribute
    public static boolean personHasAttribute(final String name) {
        final String lastCharacter = name.substring(name.length() - 1);
        return lastCharacter.equals("a");
    }
}
