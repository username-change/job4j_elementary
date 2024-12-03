package ru.job4j.ex;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class FactorialTest {
	@Test
	public void whenException() {
		Factorial factorial = new Factorial();
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, 
				() -> {
			factorial.calc(-1);
		});
		assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");

	}

	@Test
	public void whenCorrect() {
		Factorial factorial = new Factorial();
		int input = 5;
		int expected = 120;
		int result = factorial.calc(input);
		assertThat(result).isEqualTo(expected);
	}
}
