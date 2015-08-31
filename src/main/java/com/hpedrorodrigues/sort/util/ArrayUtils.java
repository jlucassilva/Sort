package com.hpedrorodrigues.sort.util;

public class ArrayUtils {

    public static int[] copy(int array[]) {
        int size = array.length;
        int copiedArray[] = new int[size];
        for (int i = 0; i < size; i++) {
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }
}