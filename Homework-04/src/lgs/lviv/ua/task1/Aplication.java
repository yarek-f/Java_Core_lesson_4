package lgs.lviv.ua.task1;

public class Aplication {

	public static void main(String[] args) {
		
		Robot robot = new Robot(); 
		robot.work();
		CoffeRobot coffe_robot=new CoffeRobot();  
		coffe_robot.work();
		RobotDancer robot_dancer = new RobotDancer(); 
		robot_dancer.work();
		RobotCoocker robot_coocke = new RobotCoocker(); 
		robot_coocke.work();
		
		System.out.println("* * *");

		Robot[] Array = {robot,coffe_robot,robot_dancer,robot_coocke};
		for (Robot arr: Array) 
		{ arr.work();
		
		}
	}

}
