package com.amila.qamp.oopzadaca2.Task3.Robot;

public class MainRobot {
    public static void main(String[] args) {

        Robot robot1 = new Robot(2,5);

        robot1.moveEast();
        robot1.moveEast();
        robot1.moveEast();
        robot1.moveNorth();
        robot1.moveNorth();
        robot1.moveNorth();
        robot1.moveNorth();

        System.out.println("Robot1 position: " + robot1.getPosition());
        System.out.println("Robot1 distance from initial position: " + robot1.getDistance());
        System.out.println("Robot1 number of moves: " + robot1.getNumberOfMoves());
        System.out.println("Robot1 last 5 positions are: ");
        robot1.printLastPosition(7);
    }
}