package algorithms.recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sum {
    /**
     * This function returns the sum of a collection.
     * */
    public static int calculateSum(final Collection<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>(list);
        int sum = 0;
        if(newList.isEmpty()) {
            return 0;
        }
        if(newList.size() == 1) {
            sum += newList.getFirst();
        } else {
            sum += newList.getFirst() + calculateSum(newList.subList(1, newList.size()));
        }
        return sum;
    }
}
