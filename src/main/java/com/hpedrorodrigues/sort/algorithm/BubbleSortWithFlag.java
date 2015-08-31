package com.hpedrorodrigues.sort.algorithm;

import com.hpedrorodrigues.sort.util.ArrayUtils;
import com.hpedrorodrigues.sort.util.Utils;

public class BubbleSortWithFlag extends BaseSort {

    private static void bubbleSortWithFlag(int array[]) {
        int workArray[] = ArrayUtils.copy(array);
        int n = workArray.length;
        boolean changed = true;

        long startTime = Utils.now();
        while (changed) {
            changed = false;
            for (int j = 0;  j < n - 1;  j++) {
                if (workArray[j] > workArray[j + 1]) {
                    int aux = workArray[j];
                    workArray[j] = workArray[j + 1];
                    workArray[j + 1] = aux;
                    changed = true;
                }
            }
        }
        long runtime = Utils.now() - startTime;
        Utils.show(workArray, runtime);
    }

    @Override
    void callback(int[] array) {
        bubbleSortWithFlag(array);
    }
}