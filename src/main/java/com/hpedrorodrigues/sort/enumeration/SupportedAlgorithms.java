package com.hpedrorodrigues.sort.enumeration;

public enum SupportedAlgorithms {
    SELECTION_SORT(1),
    INSERTION_SORT(2),
    BUBBLE_SORT(3),
    BUBBLE_SORT_WITH_FLAG(4),
    SHELL_SORT(5),
    UNKNOWN(6);

    private int value;

    SupportedAlgorithms(int value) {
        this.value = value;
    }

    public static SupportedAlgorithms find(int value) {
        for (SupportedAlgorithms algorithm : SupportedAlgorithms.values()) {
            if (algorithm.value == value) {
                return algorithm;
            }
        }
        return UNKNOWN;
    }
}