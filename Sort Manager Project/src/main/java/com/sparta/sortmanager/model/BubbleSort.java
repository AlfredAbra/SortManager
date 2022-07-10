package com.sparta.sortmanager.model;

public class BubbleSort implements Sorter {

    @Override
    public int[] Sorter(int[] arrayOfInts) {

        boolean isSorted = false;

        int tempValue = 0;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayOfInts.length - 1; i++) {
                if (arrayOfInts[i] > arrayOfInts[i + 1]) {
                    tempValue = arrayOfInts[i];
                    arrayOfInts[i] = arrayOfInts[i + 1];
                    arrayOfInts[i + 1] = tempValue;
                    isSorted = false;
                }
            }
        }
        return arrayOfInts;
    }
}
