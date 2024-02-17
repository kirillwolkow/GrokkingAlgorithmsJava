package algorithms.recursion;

import java.util.ArrayList;
import java.util.Collection;

public class Max {
    /**
     * This function returns the maximum number in a list.
     * */
    public static int getMax(final Collection<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>(list);
        if(newList.isEmpty()) {
            return 0;
        }

        if(newList.size() == 2) {
            return Math.max(newList.get(0), newList.get(1));
        } else {
            int subMax = getMax(newList.subList(1, newList.size()));
            return Math.max(newList.getFirst(), subMax);
        }
    }
}
