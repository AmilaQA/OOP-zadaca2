package com.amila.qamp.oopzadaca2.Task3.Robot;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    // atributes
    private int positionX;
    private int positionY;
    private int moves;
    List<String> positions = new ArrayList<>();

    private int startPositionX;
    private int startPositionY;


    //constructor 1 - Without parameters - the Robot starts at position (0,0)
    public Robot() {
        this.positionX = 0;
        this.positionY = 0;
        this.startPositionX = 0;
        this.startPositionY = 0;
        this.moves = 0;
    }

    //constructor 2 - With 2 parameters - initialises the Robot at position (x,y)
    public Robot(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.startPositionX = 0;
        this.startPositionY = 0;
        this.moves = 0;

    }

    //method 1 - decrease the y.position by 1
    public void moveSouth() {
        this.positionY--;
        this.moves++;
        updatePositions();
    }

    //method 2 - increase the y.position by 1
    public void moveNorth() {
        this.positionY++;
        this.moves++;
        updatePositions();
    }

    //method 3 - increase the x.position by 1
    public void moveEast() {
        this.positionX++;
        this.moves++;
        updatePositions();
    }

    //method 4 - decrease the x.position by 1
    public void moveWest() {
        this.positionX--;
        this.moves++;
        updatePositions();
    }

    //method 5 - getPosition() - return current position
    public String getPosition() {
        return "(" + this.positionX + "," + this.positionY + ")";
    }

    //method 6
    public double getDistance() {
        double distance = Math.sqrt(Math.pow(this.positionX - this.startPositionX, 2) + Math.pow(this.positionY - this.startPositionY, 2));
        return distance;
    }

    //method 7
    public int getNumberOfMoves() {
        return this.moves;
    }

    //method 8
    public void printLastPosition(int n) {
        if (moves < n) {
            for (int i = moves - 1; i >= 0; i--) {
                System.out.println(this.positions.get(i));
            }
        } else {
            for (int i = moves - 1; i >= moves - n; i--) {
                System.out.println(this.positions.get(i));
            }
        }
    }

    private void updatePositions() {
        this.positions.add(getPosition());
    }
}




