package lgs.lviv.ua.task2;

public class Aplication {

	public static void main(String[] args) {

		Car car = new Car(4.2, "Manual", new Helm(14, "Buiseness"), new Wheel(21, 4), new Body("Black", 4.8));
		System.out.println(car.isSuperCar());
		car.setSportCar();
		System.out.println(car);
		System.out.println(car.getHelm());
		System.out.println(car.getWheel());
		System.out.println(car.getBody());
		car.setBody(new Body("Red", 3.8));
		System.out.println(car.isSuperCar());
		car.setEngine(1.4);
		car.setWheel(new Wheel(13, 2.5));
		System.out.println(car.isSuperCar());

	}

}
