package com.hpedrorodrigues.sort.algorithm;

public class SelectionSort extends BaseSort {

    /**
     * O selection sort (do inglês, ordenação por seleção) é um algoritmo de ordenação baseado em se
     * passar sempre o menor valor do vetor para a primeira posição (ou o maior dependendo da ordem
     * requerida), depois o de segundo menor valor para a segunda posição, e assim é feito
     * sucessivamente com os (n-1) elementos restantes, até os últimos dois elementos.
     *
     * @see <a href="https://pt.wikipedia.org/wiki/Selection_sort">Selection Sort explanation</a>
     * @param array array a ser ordenado
     */
    private static void selectionSort(int array[]) {
        int posMin, n = array.length;

        for (int i = 0; i < n - 1; i++) {
            posMin = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[posMin]) {
                    posMin = j;
                }
            }

            if (posMin != i) {
                int aux = array[i];
                array[i] = array[posMin];
                array[posMin] = aux;
            }
        }
    }

    @Override
    void callback(int[] array) {
        selectionSort(array);
    }
}