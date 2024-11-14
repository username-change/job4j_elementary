package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void whenPoints00And20Then2() {
    	Point point = new Point(0, 0);
    	Point point2 = new Point(2, 0);
        double expected = 2.0;
        double output = point.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus5Minus4And1And1Then2Dot83() {
    	Point point = new Point(-5, -4);
    	Point point2 = new Point(1, 1);
        double expected = 7.81;
        double output = point.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints4And6And5And3ThenDot16() {
    	Point point = new Point(4, 6);
    	Point point2 = new Point(5, 3);
        double expected = 3.16;
        double output = point.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}