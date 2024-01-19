package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int counter = 0;
        for (int number = 2; finish >= number; number++) {
            if (CheckPrimeNumber.check(number)) {
                counter++;
            }
        }
        return counter;
    }
}
