/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * Learning how to use the Robots
 * @author choij2116
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // Create a City for the Robot
        City seoul = new City();
        
        //put a robot in seoul
        RobotSE hodori = new RobotSE(seoul, 2, 3, Direction.EAST);
       
       //create a wall
        new Wall(seoul, 2, 5, Direction.WEST);
        new Wall(seoul, 2, 5, Direction.EAST);
        
        //create a thing
        new Thing(seoul, 2, 4);
        new Thing(seoul, 2, 4);
        
        //move the robot forward 1 space
        hodori.move();
        
        //move the robot n number of spaces
        //hodori.move(2);
        
        //turn the robot to the left
        hodori.turnLeft();
        
        //put the letter K on hodori
        hodori.setLabel("K");
        
        //set the color of the robot
        hodori.setColor(Color.pink);
        
        //pick up the thing
        hodori.pickThing();
        
        //move once again
        hodori.move();
        
        //put the thing down
        hodori.putThing();
        hodori.move();
        
        
        
    }
}
