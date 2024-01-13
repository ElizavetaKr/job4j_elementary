package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
    return sum(first, second)
            + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double allAction(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + subtract(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета № 1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета № 2 равен: " + subtractAndDivide(20, 10));
        System.out.println("Результат расчета № 3 равен: " + allAction(10, 20));
    }
}
