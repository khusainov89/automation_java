package Robot;

import Rect.Rectangle;

public class Main {

    public static void main(String[] args) {

        Robot.work();

        CoffeRobot coffeRobot = new CoffeRobot();

        coffeRobot.work();

        RobotDancer robotDancer = new RobotDancer();

        robotDancer.work();

        RobotCoocker robotCoocker = new RobotCoocker();

        robotCoocker.work();


    }



}
