package com.hpedrorodrigues.sort.util;

import com.hpedrorodrigues.sort.pojo.AlgorithmInfo;

public class Utils {

    public static void show(int array[]) {
        System.out.print("Array: ");

        for (int item : array) {
            System.out.print(" -> " + item);
        }

        System.out.println();
    }

    public static void show(int array[], long runtime) {
        System.out.print("Array: ");

        for (int item : array) {
            System.out.print(" -> " + item);
        }

        System.out.println("\nRuntime: " + runtime);
    }

    public static void showMenu() {
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("0 -> Sair");
        System.out.println("1 -> Selection Sort");
        System.out.println("2 -> Insertion Sort");
        System.out.println("3 -> Bubble Sort");
        System.out.println("4 -> Bubble Sort with flag");
        System.out.println("5 -> Shell Sort");
        System.out.println("6 -> Merge Sort");
        System.out.println("7 -> Quick Sort");
    }

    public static void showAlgorithmResult(AlgorithmInfo algorithmInfo) {
        System.out.println("------------------------------------------------");
        System.out.println(algorithmInfo.getName() + "\n");
        System.out.println("Entradas:");
        System.out.println("Array aleatório:");
        show(algorithmInfo.getRandomArray());
        System.out.println("-");
        System.out.println("Array crescente:");
        show(algorithmInfo.getAscArray());
        System.out.println("-");
        System.out.println("Array decrescente:");
        show(algorithmInfo.getDescArray());
        System.out.println("--------");
        System.out.println("Saídas:");
        System.out.println("Array aleatório:");
        algorithmInfo.getCallable().call(algorithmInfo.getRandomArray());
        System.out.println("-");
        System.out.println("Array crescente:");
        algorithmInfo.getCallable().call(algorithmInfo.getAscArray());
        System.out.println("-");
        System.out.println("Array decrescente:");
        algorithmInfo.getCallable().call(algorithmInfo.getDescArray());
        System.out.println("------------------------------------------------");
    }

    public static long now() {
        return System.currentTimeMillis();
    }
}