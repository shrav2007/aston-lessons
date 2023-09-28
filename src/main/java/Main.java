package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Apple> apples = new ArrayList<>();
		Collections.addAll(apples, new Apple(), new Apple(), new Apple());
		Box<Apple> appleBox = new Box<>(apples);
		System.out.println("Вес коробки яблок: " + appleBox.getWeight() + " кг");
		appleBox.add(new Apple());
		System.out.println("Вес коробки яблок: " + appleBox.getWeight() + " кг");

		ArrayList<Orange> oranges = new ArrayList<>();
		Collections.addAll(oranges, new Orange(), new Orange());
		Box<Orange> orangeBox1 = new Box<>(oranges);
		System.out.println("Вес первой коробки апельсинов: " + orangeBox1.getWeight() + " кг");

		System.out.println(orangeBox1.compare(appleBox) ? "Вес коробок равен!" : "Вес коробок не равен!");

		ArrayList<Orange> oranges2 = new ArrayList<>();
		Collections.addAll(oranges2, new Orange(), new Orange(), new Orange());
		Box<Orange> orangeBox2 = new Box<>(oranges2);
		System.out.println("Вес второй коробки апельсинов: " + orangeBox2.getWeight() + " кг");

		orangeBox1.shift(orangeBox2);
		System.out.println("Вес первой коробки апельсинов: " + orangeBox1.getWeight() + " кг");
		System.out.println("Вес второй коробки апельсинов: " + orangeBox2.getWeight() + " кг");
	}

}
