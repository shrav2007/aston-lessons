package main.java;

public class Main {

	public static void main(String[] args) {
		String[][] myArray = { { "100", "200", "123", "154" }, { "300", "400", "500", "854" },
				{ "545", "324", "654", "965d" }, { "678", "988", "247", "632" } };
		try {
			System.out.println(sum(myArray));
		} catch (MyArraySizeException e) {
			System.out.println("MyArraySizeException");
		} catch (MyArrayDataException e) {
			System.out.println("MyArrayDataException");
		}
	}

	public static int sum(String[][] myArray) throws MyArraySizeException, MyArrayDataException {
		if (myArray.length != 4) {
			throw new MyArraySizeException();
		}
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i].length != 4) {
				throw new MyArraySizeException();
			}
		}
		int sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				try {
					sum += Integer.parseInt(myArray[i][j]);
				} catch (NumberFormatException e) {
					System.out.println("i = " + i);
					System.out.println("j = " + j);
					throw new MyArrayDataException();
				}
			}
		}
		return sum;
	}
}