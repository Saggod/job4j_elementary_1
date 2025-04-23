package ru.job4j.converter;

import org.junit.Assert;

import org.junit.jupiter.api.Test;


class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        Assert.assertEquals(expected, output, value);
    }

    @Test
    void rubleToDollar() {
        float input1 = 240;
        float expected1 = 3;
        float outputDollar = Converter.rubleToDollar(input1);
        float value = 0.0001f;
        Assert.assertEquals(expected1, outputDollar, value);

    }
}