package main.java.taskOne;

public class Bowl {
	
	int amountOfFood;
	
	public Bowl (int amountOfFood) {
		this.amountOfFood = amountOfFood;
	}
	
	public void addFood (int amount) {
		amountOfFood += amount;
	}
}
