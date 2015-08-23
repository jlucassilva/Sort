package com.hpedrorodrigues.sort.util;

import com.hpedrorodrigues.sort.pojo.InputInfo;

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
    }

    public static void showAlgorithmResult(InputInfo inputInfo) {
        System.out.println("------------------------------------------------");
        System.out.println(inputInfo.getMessage() + "\n");
        System.out.println("Entradas:");
        System.out.println("Array aleatório:");
        show(inputInfo.getRandomArray());
        System.out.println("-");
        System.out.println("Array crescente:");
        show(inputInfo.getAscArray());
        System.out.println("-");
        System.out.println("Array decrescente:");
        show(inputInfo.getDescArray());
        System.out.println("--------");
        System.out.println("Saídas:");
        System.out.println("Array aleatório:");
        inputInfo.getCallable().call(inputInfo.getRandomArray());
        System.out.println("-");
        System.out.println("Array crescente:");
        inputInfo.getCallable().call(inputInfo.getAscArray());
        System.out.println("-");
        System.out.println("Array decrescente:");
        inputInfo.getCallable().call(inputInfo.getDescArray());
        System.out.println("------------------------------------------------");
    }

    public static long now() {
        return System.currentTimeMillis();
    }
}