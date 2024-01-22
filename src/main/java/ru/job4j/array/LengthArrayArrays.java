package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1}, {2, 2}, {3, 3, 3}, {4, 4, 4, 4}};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Размер вложенного массива равен: " + array[i].length);
        }
    }
}
