package com.hpedrorodrigues.sort.algorithm;

import com.hpedrorodrigues.sort.util.ArrayUtils;
import com.hpedrorodrigues.sort.util.Utils;

public class ShellSort extends BaseSort {

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
    private static void shellSort(int array[]) {
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

    @Override
    void callback(int[] array) {
        shellSort(array);
    }
}