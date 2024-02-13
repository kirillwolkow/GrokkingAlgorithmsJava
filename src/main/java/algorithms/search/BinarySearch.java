package algorithms.search;

public class BinarySearch {
    /**
     * Returns the index of searched item. Returns -1 if item does not exist in that array. List has to be sorted.
     * */
    public static int getIndex(final int[] list, final int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess == item) {
                return mid;
            }

            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
