package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RectangleAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = RectangleArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenP8K2Square3() {
        int expected = 3;
        int p = 8;
        double k = 3;
        double out = RectangleArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenP16K3Square() {
        int expected = 12;
        int p = 16;
        double k = 3;
        double out = RectangleArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}
