package main.java;

public class Park {
	String address;
	String phoneNumber;
	String eMail;

	public Park(String address, String phoneNumber, String eMail) {
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
	}

	public class Attraction {
		String workTime;
		int cost;

		public Attraction(String workTime, int cost) {
			this.workTime = workTime;
			this.cost = cost;
		}

		public void print() {
			System.out.println("Адрес парка: " + address + "; Номер телефона: " + phoneNumber + "; eMail: " + eMail
					+ "; Время работы: " + workTime + "; Стоимость: " + cost);
		}
	}
	
}
