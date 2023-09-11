package main.java.taskOne;

public class Main {

	public static void main(String[] args) {
		
		Dog dogBobik = new Dog("Бобик");
		dogBobik.run(120);
		dogBobik.swim(100);
		
		Cat catMurzik = new Cat("Мурзик");
		catMurzik.run(210);
		catMurzik.swim(50);
		
		Cat catBarsik = new Cat("Барсик");
	    Animal animal = new Animal("Гоша");
	    dogBobik.printCount();
	    catBarsik.printCount();
	    animal.printCount();
	    
	    int amountOfFood = 10;
	    Bowl murzikBowl = new Bowl(amountOfFood);
	    catMurzik.eat(murzikBowl);
	    System.out.println(catMurzik.getName() + " съел " + amountOfFood);
		System.out.println(catMurzik.getName() + " " + catMurzik.isSatiety());
		
		amountOfFood = 15;
		Bowl barsikBowl = new Bowl(amountOfFood);
		catBarsik.eat(barsikBowl);
		System.out.println(catBarsik.getName() + " съел " + amountOfFood);
		System.out.println(catBarsik.getName() + " " + catBarsik.isSatiety());
		
		Cat[] cats = {catMurzik, catBarsik, new Cat("Сушка")};
		amountOfFood = 20;
		System.out.println("В тарелке всего еды: " + amountOfFood);
		Bowl catsBowl = new Bowl(amountOfFood);
		for (Cat cat : cats) {
			cat.eat(catsBowl);
			System.out.println(cat.getName() + " " + cat.isSatiety());
		}
		amountOfFood = 45;
		System.out.println("В тарелку добавили еды: " + amountOfFood);
		catsBowl.addFood(amountOfFood);
		for (Cat cat : cats) {
			cat.eat(catsBowl);
			System.out.println(cat.getName() + " " + cat.isSatiety());
		}
	}

}
