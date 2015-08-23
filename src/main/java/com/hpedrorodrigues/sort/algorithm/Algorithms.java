package com.hpedrorodrigues.sort.algorithm;

import com.hpedrorodrigues.sort.util.ArrayUtils;
import com.hpedrorodrigues.sort.util.Utils;

public class Algorithms {

    /**
     * O selection sort (do inglês, ordenação por seleção) é um algoritmo de ordenação baseado em se
     * passar sempre o menor valor do vetor para a primeira posição (ou o maior dependendo da ordem
     * requerida), depois o de segundo menor valor para a segunda posição, e assim é feito
     * sucessivamente com os (n-1) elementos restantes, até os últimos dois elementos.
     *
     * @see <a href="https://pt.wikipedia.org/wiki/Selection_sort">Selection Sort explanation</a>
     * @param array array a ser ordenado
     */
    public static void selectionSort(int array[]) {
        int workArray[] = ArrayUtils.copy(array);
        int posMin, n = workArray.length;
        
        long startTime = Utils.now();
        for (int i = 0; i < n - 1; i++) {
            posMin = i;
            for (int j = i + 1; j < n; j++) {
                if (workArray[j] < workArray[posMin]) {
                    posMin = j;
                }
            }

            if (posMin != i) {
                int aux = workArray[i];
                workArray[i] = workArray[posMin];
                workArray[posMin] = aux;
            }
        }
        long runtime = Utils.now() - startTime;
        Utils.show(workArray, runtime);
    }

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
    public static void insertionSort(int array[]) {
        int workArray[] = ArrayUtils.copy(array);
        int n = workArray.length;

        long startTime = Utils.now();
        for (int i = 1; i < n - 1; i++) {
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
    public static void bubbleSort(int array[]) {
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

    public static void bubbleSortWithFlag(int array[]) {
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

    /**
     * Criado por Donald Shell em 1959, publicado pela Universidade de Cincinnati, Shell sort é o
     * mais eficiente algoritmo de classificação dentre os de complexidade quadrática. É um
     * refinamento do método de inserção direta. O algoritmo difere do método de inserção direta
     * pelo fato de no lugar de considerar o array a ser ordenado como um único segmento, ele
     * considera vários segmentos sendo aplicado o método de inserção direta em cada um deles.
     * Basicamente o algoritmo passa várias vezes pela lista dividindo o grupo maior em menores.
     * Nos grupos menores é aplicado o método da ordenação por inserção. Implementações do algoritmo.
     *
     * @see <a href="http://www.guj.com.br/java/183464-shellsort">Shell Sort explanation</a>
     * @param array array a ser ordenado
     */
    public static void shellSort(int array[]) {
        int workArray[] = ArrayUtils.copy(array);
        int inner, outer, n = workArray.length;
        int h = 1;
        long startTime = Utils.now();
        while (h <= n / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < n; outer++) {
                int aux = workArray[outer];
                inner = outer;
                while (inner > h - 1 && workArray[inner - h] >= aux) {
                    workArray[inner] = workArray[inner - h];
                    inner -= h;
                }
                workArray[inner] = aux;
            }
            h = (h - 1) / 3;
        }
        long runtime = Utils.now() - startTime;
        Utils.show(workArray, runtime);
    }
}