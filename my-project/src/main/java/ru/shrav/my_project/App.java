package ru.shrav.my_project;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите целое число: ");
		int number = sc.nextInt();
		int factorial = getFactorial(number);
		System.out.println(factorial);
	}

	public static int getFactorial(int number) {
		if (number < 0) {
			throw new UnsupportedOperationException();
		}
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
