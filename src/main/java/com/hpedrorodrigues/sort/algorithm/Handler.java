package com.hpedrorodrigues.sort.algorithm;

import com.hpedrorodrigues.sort.enumeration.SupportedAlgorithms;
import com.hpedrorodrigues.sort.pojo.AlgorithmInfo;
import com.hpedrorodrigues.sort.util.Utils;

import java.util.Scanner;

public class Handler {

    private static final int EXIT_SUCCESS = 0;

    public static void run() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do array a ser criado...");
        int n = scan.nextInt();

        int ascArray[] = Generator.asc(n);
        int descArray[] = Generator.desc(n);
        int randomArray[] = Generator.random(n);

        AlgorithmInfo algorithmInfo = new AlgorithmInfo();
        algorithmInfo.setRandomArray(randomArray);
        algorithmInfo.setDescArray(descArray);
        algorithmInfo.setAscArray(ascArray);

        Utils.showMenu();
        int option = scan.nextInt();

        while (option != EXIT_SUCCESS) {

            SupportedAlgorithms algorithm = SupportedAlgorithms.find(option);

            switch (algorithm) {
                case SELECTION_SORT:
                    algorithmInfo.setName("Selection sort");
                algorithmInfo.setCallable(Algorithms::selectionSort);
                Utils.showAlgorithmResult(algorithmInfo);
                break;
                case INSERTION_SORT:
                    algorithmInfo.setName("Insertion sort");
                    algorithmInfo.setCallable(Algorithms::insertionSort);
                    Utils.showAlgorithmResult(algorithmInfo);
                    break;
                case BUBBLE_SORT:
                    algorithmInfo.setName("Bubble sort");
                    algorithmInfo.setCallable(Algorithms::bubbleSort);
                    Utils.showAlgorithmResult(algorithmInfo);
                    break;
                case BUBBLE_SORT_WITH_FLAG:
                    algorithmInfo.setName("Bubble sort with flag");
                    algorithmInfo.setCallable(Algorithms::bubbleSortWithFlag);
                    Utils.showAlgorithmResult(algorithmInfo);
                    break;
                case SHELL_SORT:
                    algorithmInfo.setName("Shell sort");
                    algorithmInfo.setCallable(Algorithms::shellSort);
                    Utils.showAlgorithmResult(algorithmInfo);
                    break;
                case UNKNOWN:
                    System.out.println("Opção inválida. :(\n");
            }

            Utils.showMenu();
            option = scan.nextInt();
        }
    }
}