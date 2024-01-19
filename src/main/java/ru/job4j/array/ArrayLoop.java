package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] formula = new int[5];
        for (int i = 0; i < formula.length; i++) {
            formula[i] = i * 2 + 3;
        }
        for (int element : formula) {
            System.out.println(element);
        }
    }
}
