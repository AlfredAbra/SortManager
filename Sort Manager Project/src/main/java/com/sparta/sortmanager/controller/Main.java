package com.sparta.sortmanager.controller;

import com.sparta.sortmanager.model.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        BubbleSort bubble = new BubbleSort();

        int[] arrayOfInts = {3, 6, 22, 1, 0, 32 };

        bubble.Sorter(arrayOfInts);

        System.out.println(Arrays.toString(arrayOfInts));
    }
}