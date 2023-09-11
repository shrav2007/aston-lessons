package main.java.taskOne;

public class Cat extends Animal {

	private static final int NEED_AMOUNT_OF_FOOD = 15;

	static int catsCounter;
	boolean satiety;

	public Cat(String name) {
		super(name);
		catsCounter++;
	}

	@Override
	public void run(int lenght) {
		if (lenght > 200) {
			System.out.println("Кот не может бежать больше 200 метров!");
		} else {
			super.run(lenght);
		}
	}

	@Override
	public void swim(int lenght) {
		System.out.println("Коты не умеют плавать");
		// или такой вариант:
		// throw new UnsupportedOperationException();
	}

	@Override
	public void printCount() {
		System.out.println("Всего котов создано: " + catsCounter);
	}

	public void eat(Bowl bowl) {
		if (bowl.amountOfFood >= NEED_AMOUNT_OF_FOOD) {
			bowl.amountOfFood -= NEED_AMOUNT_OF_FOOD;
			satiety = true;
		} else {
			satiety = false;
		}
	}
	
	public String isSatiety() {
		return satiety ? "сыт" : "голоден";
	}
	
}
