package Robot;

public class Main {
	public static void main(String[] arg) {
		Robot robot = new Robot();
		CoffeeRobot coffeeRobot = new CoffeeRobot();
		RobotDancer robotDancer = new RobotDancer();
		RobotCooker robotCooker = new RobotCooker();

		robot.work();
		coffeeRobot.work();
		robotDancer.work();
		robotCooker.work();

		System.out.println();
		System.out.println("Array");

		Robot[] robotArray = new Robot[4];
		robotArray[0] = robot;
		robotArray[1] = coffeeRobot;
		robotArray[2] = robotDancer;
		robotArray[3] = robotCooker;

		for (int i = 0; i < robotArray.length; i++) {
			robotArray[i].work();
		}

	}
}
