package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    void whenCalculateFactorialForSixThenSevenHundredTwenty() {
        int expected = 720;
        int number = 6;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForFourThenTwentyFour() {
        int expected = 24;
        int number = 4;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }
}