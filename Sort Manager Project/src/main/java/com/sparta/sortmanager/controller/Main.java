package com.sparta.sortmanager.controller;

import com.sparta.sortmanager.model.BubbleSort;
import com.sparta.sortmanager.model.MergeSort;
import com.sparta.sortmanager.view.View;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        BubbleSort bubble = new BubbleSort();
        MergeSort merge = new MergeSort();
        RandomiseController rc = new RandomiseController();
        View view = new View();
        Scanner scanner = new Scanner(System.in);

        int[] arrayOfInts = new int[10];

        arrayOfInts = rc.populateArray(arrayOfInts);

        view.currentArray(arrayOfInts);
        view.print();

        boolean validChoice = false;
        while (!validChoice) {
            String choice = scanner.next();
            if (choice.equals("b")) {
                validChoice = true;

                long start = System.nanoTime();
                bubble.Sorter(arrayOfInts);
                long end = System.nanoTime();
                long duration = (end - start);
                view.printBubble(arrayOfInts, duration);
            } else if (choice.equals("m")) {
                validChoice = true;

                long start = System.nanoTime();
                merge.Sorter(arrayOfInts);
                long end = System.nanoTime();
                long duration = (end - start);
                view.printMerge(arrayOfInts, duration);
            } else {
                view.printInvalid();
            }
        }
    }
}