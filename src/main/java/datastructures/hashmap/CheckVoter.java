package datastructures.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CheckVoter {
    private static final Map<String, Boolean> voted = new HashMap<>();

    private static void checkVoter(final String name) {
        if (voted.containsKey(name)) {
            System.out.println("Kick them out!");
        } else {
            voted.put(name, true);
            System.out.println("Let them vote!");
        }
    }

    public static void main(String[] args) {
        checkVoter("Tom");
        checkVoter("Mike");
        checkVoter("Mike");
    }
}
