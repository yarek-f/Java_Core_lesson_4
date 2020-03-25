package lgs.lviv.ua.task3;

public class Aplication {

	public static void main(String[] args) {

		Animal animal = new Animal("Кролик", 60, 3);
		System.out.print("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed()
				+ " км/год, Вік тварини = " + animal.getAge() + " років\n");
		animal.setAge(5);
		animal.setName("Вовк");
		animal.setSpeed(45);
		System.out.print("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed()
				+ " км/год, Вік тварини = " + animal.getAge() + " років\n");

	}

}
