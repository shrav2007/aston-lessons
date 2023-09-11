package main.java.taskOne;

public class Dog extends Animal {
	
	static int dogsCounter;

	public Dog(String name) {
		super(name);
		dogsCounter++;
	}

	@Override
	public void run(int lenght) {
		if (lenght > 500) {
			System.out.println("Собака не может бежать больше 500 метров!");
		} else {
			super.run(lenght);
		}
	}

	@Override
	public void swim(int lenght) {
		if (lenght > 10) {
			System.out.println("Собака не может плыть больше 10 метров!");
		} else {
			super.swim(lenght);
		}
	}
	
	@Override
	public void printCount() {
		System.out.println("Всего собак создано: " + dogsCounter);
	}

}
