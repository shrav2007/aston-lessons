package sharipov;

import java.util.Arrays;

public class LessonThree {

	public static void main(String[] args) {
		System.out.println(taskOne(2, 18));
		System.out.println(taskTwo(0));
		System.out.println(taskThree(5));
		taskFour("apple", 5);
		System.out.println(taskFive(2200));
		System.out.println(Arrays.toString(taskSix()));
		System.out.println(Arrays.toString(taskSeven()));
		System.out.println(Arrays.toString(taskEight()));
		taskNine();
		System.out.println(Arrays.toString(taskTen(10,20)));
	}

	private static boolean taskOne(int a, int b) {
		if (a + b >= 10 && a + b <= 20) {
			return true;
		}
		return false;
	}

	private static String taskTwo(int a) {
		if (a < 0) {
			return "Число отрицательное";
		}
		return "Число положительное";

	}

	private static boolean taskThree(int a) {
		return a < 0;
	}

	private static void taskFour(String text, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(text);
		}
	}

	private static boolean taskFive(int year) {
		if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}

	private static int[] taskSix() {
		int[] arr = { 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 1;
			} else {
				arr[i] = 0;
			}
		}
		return arr;
	}

	private static int[] taskSeven() {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

	private static int[] taskEight() {
		int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 6) {
				arr[i] = arr[i] * 2;
			}
		}
		return arr;
	}

	public static void taskNine() {
		int[][] table = new int[20][20];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (i == j || i + j == table.length - 1) {
					table[i][j] = 1;
				}
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[] taskTen(int len, int initialValue) {
		int arr[] = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = initialValue;
		}
		return arr;
	}

}
