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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //create a city for robot
        City seoul = new City();
        
        //put a robot in seoul
        RobotSE karel = new RobotSE(seoul, 1, 2, Direction.SOUTH);
        
        //create walls
        new Wall(seoul, 1, 2, Direction.NORTH);
        new Wall(seoul, 1, 2, Direction.EAST);
        new Wall(seoul, 1, 2, Direction.SOUTH);
        new Wall(seoul, 1, 1, Direction.NORTH);
        new Wall(seoul, 1, 1, Direction.WEST);
        new Wall(seoul, 2, 1, Direction.WEST);
        new Wall(seoul, 2, 1, Direction.SOUTH);
        
        //create a newspaper
        new Thing (seoul, 2, 2);
        
        //get a newspaper back
        karel.turnRight();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft(2);
        karel.move();
        karel.turnRight();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.turnRight();
      
    }
}
