package lgs.lviv.ua.task2;

public class Wheel {

	private int radius;
	private double weight;

	public Wheel(int radius, double weight) {
		super();
		this.radius = radius;
		this.weight = weight;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Wheel [radius=" + radius + ", weight=" + weight + "]";
	}

	public void changeWheelRadius(int difference) {
		radius += difference;
	}

}
