package com.hpedrorodrigues.sort.util;

public class ArrayUtils {

    public static int[] copy(int array[]) {
        int size = array.length;
        int copyArray[] = new int[size];
        for (int i = 0; i < size; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }
}