package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class TaskTwo {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		Collections.addAll(words, "Highload", "High", "Load", "Highload");
		System.out.println(containsHigh(words));
		System.out.println(firstElement(words));
		System.out.println(lastElement(words));
	}

	public static long containsHigh(ArrayList<String> words) {
		return words.stream().filter(s -> s.equals("High")).count();
	}

	public static String firstElement(ArrayList<String> words) {
		return words.stream().findFirst().orElse("0");
	}

	public static String lastElement(ArrayList<String> words) {
		Collections.reverse(words);
		return words.stream().findFirst().orElse("0");
	}
}
