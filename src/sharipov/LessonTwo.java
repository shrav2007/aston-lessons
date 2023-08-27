package sharipov;

import java.util.Random;

public class LessonTwo {

	public static void main(String[] args) {
		printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}

	private static void printThreeWords() {
		System.out.println("Orange\nBanana\nApple\n");
	}

	private static void checkSumSign() {
		Random rnd = new Random();
		int a = rnd.nextInt(100);
		int b = -1 * rnd.nextInt(100);
		System.out.println(a);
		System.out.println(b);
		if (a + b >= 0) {
			System.out.println("Сумма положительная\n");
		} else {
			System.out.println("Сумма отрицательная\n");
		}

	}

	private static void printColor() {
		Random rnd = new Random();
		int value = rnd.nextInt();
		System.out.println(value);
		if (value <= 0) {
			System.out.println("Красный\n");
		} else {
			if (value <= 100) {
				System.out.println("Желтый\n");
			} else {
				System.out.println("Зеленый\n");
			}
		}
	}

	private static void compareNumbers() {
		Random rnd = new Random();
		int a = rnd.nextInt();
		int b = rnd.nextInt();
		System.out.println(a);
		System.out.println(b);
		if (a >= b) {
			System.out.println("a >= b");
		} else {
			System.out.println("a < b");
		}
	}

}
