package com.hpedrorodrigues.sort.pojo;

import com.hpedrorodrigues.sort.listener.Callable;

public class InputInfo {

    private String message;
    private Callable<int[]> callable;

    private int[] randomArray;
    private int[] descArray;
    private int[] ascArray;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Callable<int[]> getCallable() {
        return callable;
    }

    public void setCallable(Callable<int[]> callable) {
        this.callable = callable;
    }

    public int[] getRandomArray() {
        return randomArray;
    }

    public void setRandomArray(int[] randomArray) {
        this.randomArray = randomArray;
    }

    public int[] getDescArray() {
        return descArray;
    }

    public void setDescArray(int[] descArray) {
        this.descArray = descArray;
    }

    public int[] getAscArray() {
        return ascArray;
    }

    public void setAscArray(int[] ascArray) {
        this.ascArray = ascArray;
    }
}