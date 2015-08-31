package com.hpedrorodrigues.sort.algorithm;

import com.hpedrorodrigues.sort.util.ArrayUtils;
import com.hpedrorodrigues.sort.util.Utils;

abstract class BaseSort {

    public void sort(int array[]) {
        int workArray[] = ArrayUtils.copy(array);
        long startTime = Utils.now();
        callback(workArray);
        long runtime = Utils.now() - startTime;
        Utils.show(array, runtime);
    }

    abstract void callback(int array[]);
}