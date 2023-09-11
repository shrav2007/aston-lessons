package main.java.taskTwo;

public class Rectangle implements GeometricFunction, Color {
	
	private int sideOne;
	private int sideTwo;
	private String fillColor;
	private String borderColor;

	public Rectangle(int sideOne, int sideTwo) {
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
	}

	@Override
	public void getSquare() {
		System.out.println("Площадь прямоугольника равна: " + sideOne * sideTwo);
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
		System.out.println(fillColor + " цвет заливки прямоугольника");
	}

	@Override
	public void getBorderColor() {
		System.out.println(borderColor + " цвет границы прямоугольника");
	}

}
