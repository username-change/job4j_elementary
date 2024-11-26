package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void whenPoints00And20Then2() {
    	Point point = new Point(0, 0, 0);
    	Point point2 = new Point(2, 0, 0);
        double expected = 2.0;
        double output = point.distance3d(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus5Minus4And1And1Then7Dot81() {
    	Point point = new Point(-5, -4, 0);
    	Point point2 = new Point(1, 1, 0);
        double expected = 7.81;
        double output = point.distance3d(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints4And6And5And3ThenDot16() {
    	Point point = new Point(4, 6, 0);
    	Point point2 = new Point(5, 3, 0);
        double expected = 3.16;
        double output = point.distance3d(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}