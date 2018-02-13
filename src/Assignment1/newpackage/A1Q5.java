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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a city
        City seoul = new City();
        
        //create a robot
        RobotSE karel = new RobotSE(seoul, 3, 3, Direction.EAST);
        RobotSE maria = new RobotSE(seoul, 0, 1, Direction.WEST);
        
         //put the letter K on karel
        karel.setLabel("K");
        
        //put the letter M on maria
        maria.setLabel("M");
        
        //create walls
        new Wall(seoul, 2, 3, Direction.WEST);
        new Wall(seoul, 2, 3, Direction.NORTH);
        new Wall(seoul, 2, 3, Direction.EAST);
        new Wall(seoul, 3, 3, Direction.EAST);
        new Wall(seoul, 3, 3, Direction.SOUTH);
        
        //create things
        new Thing(seoul, 0, 0);
        new Thing(seoul, 1, 0);
        new Thing(seoul, 1, 1);
        new Thing(seoul, 1, 2);
        new Thing(seoul, 2, 2);
        
        //they pick things 
        maria.move();
        karel.turnLeft(2);
        maria.pickThing();
        karel.move();
        maria.turnLeft();
        karel.turnRight();
        maria.move();
        karel.move();
        maria.pickThing();
        karel.pickThing();
        maria.turnLeft();
        karel.move();
        maria.move();
        karel.pickThing();
        maria.pickThing();
        karel.turnLeft();
        
        
    }
}
