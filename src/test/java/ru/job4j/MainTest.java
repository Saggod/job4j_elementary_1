package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class MainTest {

    @Test
    public void whenActionThenResult() {
        int excepted = 1;
        int result = 1;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    public void changeSizeValue() {
        int size = 10;
        size = 100;
        size = size - 5;
        System.out.println("size = " + size);
    }
}
