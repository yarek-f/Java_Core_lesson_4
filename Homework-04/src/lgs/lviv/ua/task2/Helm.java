package lgs.lviv.ua.task2;

public class Helm {
	
	private int diameter;
	private String type;
	public Helm(int diameter, String type) {
		super();
		this.diameter = diameter;
		this.type = type;
	}
	
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Helm [diameter=" + diameter + ", type=" + type + "]";
	}
	public void changeHelm(String type) {
		this.type = type;
		switch (type) {
			case "Comfort":
				diameter = 14;
				break;
			case "Sport":
				diameter = 10;
				break;
			default:
				diameter = 12;
		}
	}
	
}
