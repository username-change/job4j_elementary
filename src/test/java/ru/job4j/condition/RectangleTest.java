package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class RectangleTest {

    @Test
    void when3And4Then7() {
        double length = 3;
        double width = 4;
        double expected = 5;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when4And5Then6Dot40() {
        double length = 4;
        double width = 5;
        double expected = 6.40;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}