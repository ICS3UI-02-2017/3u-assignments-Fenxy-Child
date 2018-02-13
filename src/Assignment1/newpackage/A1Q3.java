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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a city
        City seoul = new City();
        
        //create a robot
        RobotSE hodori = new RobotSE(seoul, 3, 0, Direction.EAST);
        
        //create walls
        new Wall(seoul, 3, 2, Direction.WEST);
        new Wall(seoul, 3, 2, Direction.NORTH);
        new Wall(seoul, 2, 3, Direction.WEST);
        new Wall(seoul, 1, 3, Direction.WEST);
        new Wall(seoul, 1, 3, Direction.NORTH);
        new Wall(seoul, 1, 3, Direction.EAST);
        new Wall(seoul, 2, 4, Direction.NORTH);
        new Wall(seoul, 2, 4, Direction.EAST);
        new Wall(seoul, 3, 4, Direction.EAST);
        
        //create a flag
        new Thing(seoul, 3, 1);
        
        //put the flag on the original position
        hodori.move();
        hodori.pickThing();
        hodori.turnLeft();
        hodori.move();
        hodori.turnRight();
        hodori.move();
        hodori.turnLeft();
        hodori.move(2);
        hodori.turnRight();
        hodori.move();
        hodori.putThing();
        hodori.move();
        hodori.turnRight();
        hodori.move();
        hodori.turnLeft();
        hodori.move();
        hodori.turnRight();
        hodori.move(2);
        hodori.turnLeft();      
    }
}
