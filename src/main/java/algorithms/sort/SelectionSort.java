package algorithms.sort;

import java.util.ArrayList;
import java.util.Collection;

public class SelectionSort {
    /**
     * Returns the index of the smallest item in the array.
     * */
    public static int findSmallest(final Collection<Integer> array) {
        ArrayList<Integer> arrayList = new ArrayList<>(array);
        int smallest = arrayList.get(0);
        int smallest_index = 0;

        for(int i = 0; i < array.size(); i++) {
            if(arrayList.get(i) < smallest) {
                smallest = arrayList.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }

    /**
     * Returns a new array which is sorted in ascending order.
     * */
    public static Collection<Integer> sort(final Collection<Integer> array) {
        ArrayList<Integer> oldArray = new ArrayList<>(array);
        Collection<Integer> newArray = new ArrayList<>(array.size());
        for(int i = 0; i < array.size(); i++) {
            int smallest = findSmallest(oldArray);
            newArray.add(oldArray.get(smallest));
            oldArray.remove(smallest);
        }
        return newArray;
    }
}
