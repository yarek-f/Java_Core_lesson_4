package lgs.lviv.ua.task2;

public class Car {

	private double engine;
	private String transmissionType;
	private Helm helm;
	private Wheel wheel;
	private Body body;
	public Car(double engine, String transmissionType, Helm helm, Wheel wheel, Body body) {
		super();
		this.engine = engine;
		this.transmissionType = transmissionType;
		this.helm = helm;
		this.wheel = wheel;
		this.body = body;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	public Helm getHelm() {
		return helm;
	}
	public void setHelm(Helm helm) {
		this.helm = helm;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", transmissionType=" + transmissionType + ", helm=" + helm + ", wheel="
				+ wheel + ", body=" + body + "]";
	}
	
	public void setSportCar() {
		if (engine < 2.0)
			engine = 2.0;
		transmissionType = "Manual";
		helm.changeHelm("Sport");
		if (wheel.getRadius() < 19)
			wheel.changeWheelRadius(3);
		body.setColor("Red");
	}
	public String isSuperCar() {
		if (engine > 4.0 && wheel.getRadius()>19 && body.getLength() > 4.5)
			return "That's SuperCar!";
		else if (engine < 1.5 && wheel.getRadius() < 14)
			return "That's veery boring car...";
		else
			return "Somthing between.";
	}
	
}
