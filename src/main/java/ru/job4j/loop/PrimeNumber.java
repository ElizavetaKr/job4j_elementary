package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int counter = 0;
        for (int i = 1; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                counter++;
            }
        }
        return counter;
    }
}
