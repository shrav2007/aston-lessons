package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class TaskFive {

	public static void main(String[] args) {

		Supplier<String> loginFactory = () -> {
			Scanner in = new Scanner(System.in);
			System.out.println("Введите логин: ");
			return in.nextLine();
		};

		List<String> logins = new ArrayList<>();
		for (String login = loginFactory.get(); !login.isEmpty(); login = loginFactory.get()) {
			logins.add(login);
		}
		System.out.println(logins);
		logins.stream().filter(l -> l.startsWith("f")).forEach(l -> System.out.println(l));
	}

}
