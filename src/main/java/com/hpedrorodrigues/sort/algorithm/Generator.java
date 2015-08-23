package com.hpedrorodrigues.sort.algorithm;

public class Generator {

    public static int[] random(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * (n + 1));
        }
        return arr;
    }

    public static int[] asc(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int[] desc(int n) {
        int arr[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = n - i;
        }
        return arr;
    }
}