package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumFrom22And5Then0() {
        int a = 22, b = 5;
        int expected = 0;
        int output = Counter.sum(a, b);
        assertThat(output).isEqualTo(expected);

    }

    @Test
    void whenSumFrom12And0Then0() {
        int a = 12, b = 0;
        int expected = 0;
        int output = Counter.sum(a, b);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumFrom10And20Then165() {
        int a = 10, b = 20;
        int expected = 165;
        int output = Counter.sum(a, b);
        assertThat(output).isEqualTo(expected);
    }
}