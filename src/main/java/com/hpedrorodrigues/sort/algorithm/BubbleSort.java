package com.hpedrorodrigues.sort.algorithm;

import com.hpedrorodrigues.sort.util.ArrayUtils;
import com.hpedrorodrigues.sort.util.Utils;

public class BubbleSort extends BaseSort {

    /**
     * O bubble sort, ou ordenação por flutuação (literalmente "por bolha"), é um algoritmo de
     * ordenação dos mais simples. A idéia é percorrer o vetor diversas vezes, a cada passagem
     * fazendo flutuar para o topo o maior elemento da sequência. Essa movimentação lembra a forma
     * como as bolhas em um tanque de água procuram seu próprio nível, e disso vem o nome do algoritmo.
     * No melhor caso, o algoritmo executa n operações relevantes, onde n representa o número de
     * elementos do vetor. No pior caso, são feitas n^2 operações. A complexidade desse algoritmo é
     * de Ordem quadrática. Por isso, ele não é recomendado para programas que precisem de
     * velocidade e operem com quantidade elevada de dados.
     *
     * @see <a href="https://pt.wikipedia.org/wiki/Bubble_sort">Bubble Sort explanation 1</a>
     * @see <a href="http://mathbits.com/MathBits/Java/arrays/Bubble.htm">Bubble Sort explanation 2</a>
     * @param array array a ser ordenado
     */
    private static void bubbleSort(int array[]) {
        int workArray[] = ArrayUtils.copy(array);
        int n = workArray.length;

        long startTime = Utils.now();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (workArray[j - 1] > workArray[j]) {
                    int aux = workArray[j - 1];
                    workArray[j - 1] = workArray[j];
                    workArray[j] = aux;
                }
            }
        }
        long runtime = Utils.now() - startTime;
        Utils.show(workArray, runtime);
    }

    @Override
    void callback(int[] array) {
        bubbleSort(array);
    }
}