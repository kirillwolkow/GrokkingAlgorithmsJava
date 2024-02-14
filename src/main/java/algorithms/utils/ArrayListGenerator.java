package algorithms.utils;

import java.util.Collection;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListGenerator {
    public static Collection<Integer> generateSmallArrayList() {
        return IntStream.rangeClosed(1, 5)
                .boxed()
                .collect(Collectors.toUnmodifiableList());
    }

    public static Collection<Integer> generateMediumArrayList() {
        return IntStream.rangeClosed(1, 25)
                .boxed()
                .collect(Collectors.toUnmodifiableList());
    }

    public static Collection<Integer> generateLargeArrayList() {
        return IntStream.rangeClosed(1, 1000)
                .boxed()
                .collect(Collectors.toUnmodifiableList());
    }

    public static Collection<Integer> generateArrayList(final int size) {
        return IntStream.rangeClosed(1, size)
                .boxed()
                .collect(Collectors.toUnmodifiableList());
    }

    public static Collection<Integer> generateRandomArrayList(final int size) {
        return IntStream.generate(() -> new Random().nextInt(size))
                .limit(size)
                .boxed()
                .collect(Collectors.toList());
    }
}
