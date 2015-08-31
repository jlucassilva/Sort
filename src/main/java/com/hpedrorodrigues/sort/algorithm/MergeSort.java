package com.hpedrorodrigues.sort.algorithm;

public class MergeSort extends BaseSort {

    private static int[] left(int array[]) {
        int size = (array.length / 2) - 1;
        int copiedArray[] = new int[size];
        for (int i = 0; i < size; i++) {
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }

    private static int[] right(int array[]) {
        int size = array.length - 1, half = array.length / 2;
        int copiedArray[] = new int[size];
        for (int i = half; i < size; i++) {
            copiedArray[i - half] = array[i];
        }
        return copiedArray;
    }

    private static int[] merge(int array1[], int array2[]) {
        int i = 0, j = 0, size = (array1.length + array2.length);
        int mergedArray[] = new int[size];
        for (int k = 0; k < size - 1; k++) {
            if (array1[i] < array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
        }
        return mergedArray;
    }

    /**
     * O merge sort, ou ordenação por mistura, ou até mesmo ordenação por entrechechamento, é um
     * exemplo de algoritmo de ordenação do tipo dividir-para-conquistar.
     *
     * Sua ideia básica consiste em Dividir(o problema em vários sub-problemas e resolver esses
     * sub-problemas através da recursividade) e Conquistar(após todos os sub-problemas terem sido
     * resolvidos ocorre a conquista que é a união das resoluções dos sub-problemas). Como o
     * algoritmo do Merge Sort usa a recursividade em alguns problemas esta técnica não é muito
     * eficiente devido ao alto consumo de memória e tempo de execução.
     *
     * Os três passos úteis dos algoritmos dividir-para-conquistar, ou divide and conquer, que se
     * aplicam ao merge sort são:
     * Dividir: Dividir os dados em subsequências pequenas;
     * Conquistar: Classificar as duas metades recursivamente aplicando o merge sort;
     * Combinar: Juntar as duas metades em um único conjunto já classificado.
     * @see <a href="https://pt.wikipedia.org/wiki/Merge_sort">Merge Sort explanation</a>
     * @param array array a ser ordenado
     * @return array ordenado
     */
    private static int[] mergeSort(int array[]) {
        if (array.length == 1) {
            return array;
        }

        int array1[] = mergeSort(left(array));
        int array2[] = mergeSort(right(array));

        array = merge(array1, array2);
        return array;
    }

    @Override
    void callback(int[] array) {
        mergeSort(array);
    }
}