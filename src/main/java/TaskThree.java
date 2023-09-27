package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TaskThree {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		Collections.addAll(words, "f10", "f15", "f2", "f4", "f4");
		System.out.println(Arrays.toString(sort(words)));
	}

	public static Object[] sort(ArrayList<String> words) {
		return words.stream().sorted().toArray();
	}
}