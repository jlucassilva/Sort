package com.hpedrorodrigues.sort.algorithm;

import com.hpedrorodrigues.sort.util.ArrayUtils;
import com.hpedrorodrigues.sort.util.Utils;

public class InsertionSort extends BaseSort {

    /**
     * Insertion sort, ou ordenação por inserção, é um simples algoritmo de ordenação, eficiente
     * quando aplicado a um pequeno número de elementos. Em termos gerais, ele percorre um vetor de
     * elementos da esquerda para a direita e à medida que avança vai deixando os elementos mais à
     * esquerda ordenados. O algoritmo de inserção funciona da mesma maneira com que muitas pessoas
     * ordenam cartas em um jogo de baralho como o pôquer.
     *
     * @see <a href="https://pt.wikipedia.org/wiki/Insertion_sort">Insertion Sort explanation</a>
     * @param array array a ser ordenado
     */
    private static void insertionSort(int array[]) {
        int workArray[] = ArrayUtils.copy(array);
        int n = workArray.length;

        long startTime = Utils.now();
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            while (j >= 0 && workArray[j] > workArray[j + 1]) {
                int aux = workArray[j];
                workArray[j] = workArray[j + 1];
                workArray[j + 1] = aux;
                j--;
            }
        }
        long runtime = Utils.now() - startTime;
        Utils.show(workArray, runtime);
    }

    @Override
    void callback(int[] array) {
        insertionSort(array);
    }
}