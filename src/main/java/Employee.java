package main.java;

public class Employee {
	String name;
	String jobTitle;
	String eMail;
	String phoneNumber;
	int salary;
	int age;

	public Employee(String name, String jobTitle, String eMail, String phoneNumber, int salary, int age) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.age = age;
	}

	public void print() {
		System.out.println("ФИО: " + name + "; Должность: " + jobTitle + "; eMail: " + eMail + "; Телефон: "
				+ phoneNumber + "; Зарплата: " + salary + "; Возраст: " + age);
	}

}
