package main.java.taskTwo;

public interface GeometricFunction {
	
	default void getPerimeter(int[] sides) {
		int perimeter = 0;
		for (int i = 0; i < sides.length; i++) {
			perimeter += sides[i];
		}
		System.out.println("Периметр равен: " + perimeter);
	}
	
	default void getCirclePerimeter(int radius) {
		double pi = 3.14;
		System.out.println("Периметр равен: " + 2 * pi * radius);
	}


	void getSquare();
}
