package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusChar(double first, double second) {
        return minus(first, second);
    }

    public static double divideChar(double first, double second) {
        return divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusChar(20, 10));
        System.out.println("Результат расчета равен: " + divideChar(20, 10));
    }
}
