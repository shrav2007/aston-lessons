package ru.shrav.my_project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {
	
	@Test
	@DisplayName("Проверка вычисления факториала нуля")
	public void testNullNumber() {
		assertEquals(1, App.getFactorial(0));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-5, -3, -1})
	@DisplayName("Проверка вычисления факториала отрицательного числа")
	public void testNegativeNumber(int number) {
		assertThrows(UnsupportedOperationException.class, () -> App.getFactorial(number));
	}

	@Test
	@DisplayName("Проверка вычисления положительного числа")
	public void testPositiveNumber() {
		assertEquals(120, App.getFactorial(5));
	}
}
