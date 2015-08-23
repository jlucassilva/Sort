package com.hpedrorodrigues.sort.algorithm;

import com.hpedrorodrigues.sort.enumeration.AlgorithmsSort;
import com.hpedrorodrigues.sort.pojo.InputInfo;
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

        InputInfo inputInfo = new InputInfo();
        inputInfo.setRandomArray(randomArray);
        inputInfo.setDescArray(descArray);
        inputInfo.setAscArray(ascArray);

        Utils.showMenu();
        int option = scan.nextInt();

        while (option != EXIT_SUCCESS) {

            AlgorithmsSort algorithm = AlgorithmsSort.find(option);

            switch (algorithm) {
                case SELECTION_SORT:
                    inputInfo.setMessage("Selection sort");
                    inputInfo.setCallable(Algorithms::selectionSort);
                    Utils.showAlgorithmResult(inputInfo);
                    break;
                case INSERTION_SORT:
                    inputInfo.setMessage("Insertion sort");
                    inputInfo.setCallable(Algorithms::insertionSort);
                    Utils.showAlgorithmResult(inputInfo);
                    break;
                case BUBBLE_SORT:
                    inputInfo.setMessage("Bubble sort");
                    inputInfo.setCallable(Algorithms::bubbleSort);
                    Utils.showAlgorithmResult(inputInfo);
                    break;
                case BUBBLE_SORT_WITH_FLAG:
                    inputInfo.setMessage("Bubble sort with flag");
                    inputInfo.setCallable(Algorithms::bubbleSortWithFlag);
                    Utils.showAlgorithmResult(inputInfo);
                    break;
                case SHELL_SORT:
                    inputInfo.setMessage("Shell sort");
                    inputInfo.setCallable(Algorithms::shellSort);
                    Utils.showAlgorithmResult(inputInfo);
                    break;
                case UNKNOWN:
                    System.out.println("Opção inválida. :(\n");
            }

            Utils.showMenu();
            option = scan.nextInt();
        }
    }
}