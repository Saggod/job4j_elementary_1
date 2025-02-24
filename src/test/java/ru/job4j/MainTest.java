package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class MainTest {

    public static void plus(int first, int second){
        int sum = first + second;
        System.out.println("first + second = " + sum);
    }

    @Test
    public void result() {
        MainTest.plus(100, 500);
        MainTest.plus(4, 2);
        MainTest.plus(3, 5);
    }

}
