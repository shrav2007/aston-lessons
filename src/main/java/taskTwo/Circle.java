package main.java.taskTwo;

public class Circle implements GeometricFunction, Color {

	private static final double PI = 3.14;

	private int radius;
	private String fillColor;
	private String borderColor;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void getSquare() {
		System.out.println("Площадь круга равна: " + PI * radius * radius);
	}

	@Override
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	@Override
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	@Override
	public void getFillColor() {
		System.out.println(fillColor + " цвет заливки круга");
	}

	@Override
	public void getBorderColor() {
		System.out.println(borderColor + " цвет границы круга");
	}

}
