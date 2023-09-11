package main.java.taskTwo;

public class Triangle implements GeometricFunction, Color {

	private int side1;
	private int side2;
	private int side3;
	private String fillColor;
	private String borderColor;

	
	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public void getSquare() {
		int p = side1 + side2 + side3;
		System.out.println("Площадь треугольника равна: " + Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
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
		System.out.println(fillColor + " цвет заливки треугольника");
	}

	@Override
	public void getBorderColor() {
		System.out.println(borderColor + " цвет границы треугольника");
	}

}
