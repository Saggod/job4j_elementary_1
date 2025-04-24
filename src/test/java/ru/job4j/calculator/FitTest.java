package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double delta = 0.01;
        double output = Fit.manWeight(input);
        Assert.assertEquals(expected, output, delta);
    }

    @Test
    void whenWoman160Then60() {
        short input = 160;
        double expected = 57.49;
        double delta = 0.01;
        double output = Fit.womanWeight(input);
        Assert.assertEquals(expected, output, delta);
    }
}