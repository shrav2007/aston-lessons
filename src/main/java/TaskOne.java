package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class TaskOne {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Collections.addAll(numbers, 3, 2, 5, 8, 6, 9);
		System.out.println(countEven(numbers));
	}

	public static long countEven(ArrayList<Integer> numbers) {
		return numbers.stream().filter(s -> s % 2 == 0).count();
	}
}
