package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class VectorTest {

    @Test
    void whenVectors34And34ThenResult68() {
        int x1 = 3, y1 = 4, x2 = 3, y2 = 4;
        String expected = "(6, 8)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus13And34ThenResult22() {
        int x1 = -10, y1 = -12, x2 = 3, y2 = 4;
        String expected = "(-7, -8)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus12AndMinus34ThenResultMinus46() {
        int x1 = -8, y1 = -2, x2 = -3, y2 = -4;
        String expected = "(-11, -6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }
}