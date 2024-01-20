package ru.job4j.array;

public class ArrayDefinition {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Andrey";
        names[1] = "Anna";
        names[2] = "Anton";
        names[3] = "Akim";
        System.out.println("Размер массива \"ages\" равен: " + ages.length);
        System.out.println("Размер массива \"surnames\" равен: " + surnames.length);
        System.out.println("Размер массива \"prices\" равен: " + prices.length);
        System.out.println(names[0] + System.lineSeparator() + names[1]
                + System.lineSeparator() + names[2] + System.lineSeparator()
                + names[3]);
    }
}
