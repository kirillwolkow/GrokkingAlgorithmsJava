package algorithms.utils;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayGenerator {
    public static int[] generateSmallList() {
        return new int[]{1, 2, 4, 6, 8, 10, 12};
    }

    public static int[] generateMediumList() {
        int[] list = new int[26];
        for (int i = 1; i < 26; i++) {
            list[i] = i + 1;
        }
        return list;
    }

    public static int[] generateLargeList() {
        int[] list = new int[1001];
        for (int i = 1; i < 1001; i++) {
            list[i] = i + 1;
        }
        return list;
    }

    public static int[] generateList(final int size) {
        int[] list = new int[size+1];
        for (int i = 1; i < size + 1; i++) {
            list[i] = i + 1;
        }
        return list;
    }

    public static int[] generateRandomList(final int size) {
        return IntStream.generate(() -> new Random().nextInt(size)).limit(size).toArray();
    }
}
