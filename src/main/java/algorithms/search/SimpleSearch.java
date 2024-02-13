package algorithms.search;

public class SimpleSearch {
    /**
    * Returns the index of searched item. Returns -1 if item does not exist in that array.
    * */
    public static int getIndex(final int[] list, final int item) {
        for(int i = 0; i < list.length; i++) {
            if(item == list[i]) {
                return i;
            }
        }
        return -1;
    }
}
