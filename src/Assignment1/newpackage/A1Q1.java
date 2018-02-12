/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1.newpackage;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author choij2116
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a city for robot
        City seoul = new City();
        
        //put a robot in seoul
        RobotSE hodori = new RobotSE(seoul, 0, 2, Direction.WEST);
        
        //create walls
        new Wall(seoul, 1, 2, Direction.NORTH);
        new Wall(seoul, 1, 1, Direction.NORTH);
        new Wall(seoul, 1, 1, Direction.WEST);
        new Wall(seoul, 2, 1, Direction.WEST);
        new Wall(seoul, 2, 1, Direction.SOUTH);
        new Wall(seoul, 2, 2, Direction.SOUTH);
        new Wall(seoul, 2, 2, Direction.EAST);
        new Wall(seoul, 1, 2, Direction.EAST);
        
        //move the robot in counterclockwise
        hodori.move(2);
        hodori.turnLeft();
        hodori.move(3);
        hodori.turnLeft();
        hodori.move(3);
        hodori.turnLeft();
        hodori.move(3);
        hodori.turnLeft();
        hodori.move();
    }
}
