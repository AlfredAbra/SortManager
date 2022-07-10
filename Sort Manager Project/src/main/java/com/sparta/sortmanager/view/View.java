package com.sparta.sortmanager.view;

import java.util.Arrays;

public class View {
    public void print() {
        System.out.println("Please enter the sort algorithm you would like to use. b for bubble, m for merge");
    }
    public void currentArray(int[] arrayOfInts) {
        System.out.println("Current array: " + Arrays.toString(arrayOfInts));
    }
    public void printBubble(int[] arrayOfInts, long duration) {
        System.out.println("Sorted array: " + Arrays.toString(arrayOfInts));
        System.out.println("Time taken to sort: " + duration);
    }
    public void printMerge(int[] arrayOfInts, long duration) {
        System.out.println("Sorted array: " + Arrays.toString(arrayOfInts));
        System.out.println("Time taken to sort: " + duration);
    }
    public void printInvalid() {
        System.out.println("Invalid input. Try again");
    }
}
