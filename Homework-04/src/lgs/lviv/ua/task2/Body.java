package lgs.lviv.ua.task2;

public class Body {

	private String color;
	private double length;
	public Body(String color, double length) {
		super();
		this.color = color;
		this.length = length;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Body [color=" + color + ", length=" + length + "]";
	}
	public void defaultColor() {
		color = "White";
	}
	
}
