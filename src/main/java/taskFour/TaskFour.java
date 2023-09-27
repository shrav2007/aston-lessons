package main.java.taskFour;

import java.util.Arrays;
import java.util.Collection;

public class TaskFour {

	public static void main(String[] args) {

		Collection<Student> students = Arrays.asList(new Student("Дмитрий", 17, Gender.MAN),
				new Student("Максим", 20, Gender.MAN), new Student("Екатерина", 20, Gender.WOMAN),
				new Student("Михаил", 28, Gender.MAN));

		System.out.println(students.stream().filter(s -> s.getGender() == Gender.MAN).mapToInt(Student::getAge).average());
		
		students.stream().filter(s -> s.getGender() == Gender.MAN).filter(s -> s.getAge() >= 18)
				.filter(s -> s.getAge() <= 27).map(Student::getName).forEach(s -> System.out.println(s));;
	}
	
}
