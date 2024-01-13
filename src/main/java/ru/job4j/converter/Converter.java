package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(360);
        float inputEuro = 140;
        float expectedEuro = 2;
        float outputEuro = Converter.rubleToEuro(inputEuro);
        boolean passedEuro = expectedEuro == outputEuro;
        System.out.println("140 rubles are 2 Euro. Test result : " + passedEuro);
        float inputDollar = 360;
        float expectedDollar = 6;
        float outputDollar = Converter.rubleToDollar(inputDollar);
        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("360 rubles are 6 Dollar. Test result : " + passedDollar);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("360 rubles are " + dollar + " dollars.");
    }
}
