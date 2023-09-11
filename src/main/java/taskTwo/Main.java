package main.java.taskTwo;

public class Main {

	public static void main(String[] args) {

		Circle circle = new Circle(5);
		circle.getCirclePerimeter(5);
		circle.getSquare();
		circle.setFillColor("Красный");
		circle.setBorderColor("Желтый");
		circle.getFillColor();
		circle.getBorderColor();

		Triangle triangle = new Triangle(10, 15, 12);
		triangle.getPerimeter(new int[] {10, 15, 12});
		triangle.getSquare();
		triangle.setFillColor("Синий");
		triangle.setBorderColor("Зеленый");
		triangle.getFillColor();
		triangle.getBorderColor();

		Rectangle rectangle = new Rectangle(10, 15);
		rectangle.getPerimeter(new int[] {10, 15, 10, 15});
		rectangle.getSquare();
		rectangle.setFillColor("Черный");
		rectangle.setBorderColor("Оранжевый");
		rectangle.getFillColor();
		rectangle.getBorderColor();
	}

}
