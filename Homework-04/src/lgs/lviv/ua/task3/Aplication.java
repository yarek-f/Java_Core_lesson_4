package lgs.lviv.ua.task3;

public class Aplication {

	public static void main(String[] args) {

		Animal animal = new Animal("������", 60, 3);
		System.out.print("����� ������� = " + animal.getName() + ", �������� ������� = " + animal.getSpeed()
				+ " ��/���, ³� ������� = " + animal.getAge() + " ����\n");
		animal.setAge(5);
		animal.setName("����");
		animal.setSpeed(45);
		System.out.print("����� ������� = " + animal.getName() + ", �������� ������� = " + animal.getSpeed()
				+ " ��/���, ³� ������� = " + animal.getAge() + " ����\n");

	}

}
