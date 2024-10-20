package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2EuroThen1Dot86() {
        float input = 140;
        float expected = 1.8666F;
        float output  = Converter.rubleToDollar(input);
        float value = 0.0001F;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert0RblThen0Dollar() {
        float input = 0;
        float expected = 0;
        float output  = Converter.rubleToEuro(input);
        float value = 0.0001F;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert180RblThen3DollarThen2Dot4() {
        float input = 180;
        float expected = 2.4F;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001F;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}