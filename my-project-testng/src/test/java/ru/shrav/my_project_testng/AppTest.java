package ru.shrav.my_project_testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest {

	@Test(description = "Проверка вычисления факториала нуля")
	public void testNullNumber() {
		Assert.assertEquals(1, App.getFactorial(0), "Ошибка вычисления факториала нуля");
	}

	@DataProvider
	public Object[] negativeNumbers() {
		return new Object[] { -5, -3, -1 };
	}

	@Test(description = "Проверка вычисления факториала отрицательного числа", dataProvider = "negativeNumbers")
	public void testNegativeNumber(int number) {
		Assert.assertThrows("Ошибка вычисления факториала отрицательного числа", UnsupportedOperationException.class,
				() -> App.getFactorial(number));
	}

	@Test(description = "Проверка вычисления факториала положительного числа")
	public void testPositiveNumber() {
		Assert.assertEquals(120, App.getFactorial(5), "Ошибка вычисления факториала от числа 5");
	}
}
