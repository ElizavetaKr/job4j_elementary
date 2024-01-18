package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(4));
    }
}
