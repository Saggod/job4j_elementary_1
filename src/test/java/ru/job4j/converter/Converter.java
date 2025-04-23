package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 80;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float input = 140;
        float input1 = 240;
        float expected = 2;
        float expected1 = 3;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float outputDollar = Converter.rubleToDollar(input1);
        boolean passed1 = expected1 == outputDollar;
        System.out.println("240 rubles are 3. Test result : " + passed1);
    }
}