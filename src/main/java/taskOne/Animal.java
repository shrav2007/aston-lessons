package main.java.taskOne;

public class Animal {

	static int animalsCounter;
	private String name;

	public Animal(String name) {
		this.name = name;
		animalsCounter++;
	}

	public void run(int lenght) {
		System.out.println(name + " пробежал " + lenght + " метров");
	}

	public void swim(int lenght) {
		System.out.println(name + " проплыл " + lenght + " метров");
	}
	
	public void printCount() {
		System.out.println("Всего животных создано: " + animalsCounter);
	}
	
	public String getName() {
		return name;
	}

}
