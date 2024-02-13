package algorithms.utils;

public class ArrayGenerator {
    public static int[] generateSmallList() {
        return new int[]{1, 2, 4, 6, 8, 10, 12};
    }

    public static int[] generateMediumList() {
        int[] list = new int[25];
        for (int i = 0; i < 25; i++) {
            list[i] = i + 1;
        }
        return list;
    }

    public static int[] generateLargeList() {
        int[] list = new int[1000];
        for (int i = 0; i < 1000; i++) {
            list[i] = i + 1;
        }
        return list;
    }

    public static int[] generateList(final int size) {
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = i + 1;
        }
        return list;
    }
}
