package com.sparta.sortmanager.controller;

import java.util.Random;

public class RandomiseController {
    public int[] populateArray(int[] arrayOfInts) {
        Random rand = new Random(0);

        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = rand.nextInt(1000);
        }
        return arrayOfInts;
    }
}
