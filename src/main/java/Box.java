package main.java;

import java.util.ArrayList;

public class Box<T extends Fruit> {
	
	ArrayList<T> fruits = new ArrayList<>();

	public Box(ArrayList<T> fruits) {
		this.fruits = fruits;
	}

	public ArrayList<T> getFruits() {
		return fruits;
	}

	public float getWeight() {
		float weight = 0;
		for (T fruit : fruits) {
			weight += fruit.getWeightPerOne();
		}
		return weight;
	}

	public boolean compare(Box<?> fruitsBox) {
		return getWeight() == fruitsBox.getWeight();
	}

	public void shift(Box<T> fruitsBox) {
		fruitsBox.getFruits().addAll(fruits);
		fruits.clear();
	}

	public void add(T fruit) {
		fruits.add(fruit);
	}

}
