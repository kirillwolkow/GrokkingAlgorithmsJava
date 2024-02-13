package algorithms;

import algorithms.search.BinarySearch;
import algorithms.search.SimpleSearch;

import static algorithms.utils.ArrayGenerator.*;

public class Main {
    public static void main(String[] args) {
        int[] smallList = generateSmallList();
        int[] mediumList = generateMediumList();
        int[] largeList = generateLargeList();

        System.out.println("SimpleSearch smallList: " + SimpleSearch.getIndex(smallList, 8));
        System.out.println("SimpleSearch mediumList: " + SimpleSearch.getIndex(mediumList, 17));
        System.out.println("SimpleSearch largeList: " + SimpleSearch.getIndex(largeList, 91));

        System.out.println("BinarySearch smallList: " + BinarySearch.getIndex(smallList, 8));
        System.out.println("BinarySearch mediumList: " + BinarySearch.getIndex(mediumList, 17));
        System.out.println("BinarySearch largeList: " + BinarySearch.getIndex(largeList, 91));
    }
}
