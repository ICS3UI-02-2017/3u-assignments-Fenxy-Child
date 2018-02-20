/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author choij2116
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a city
        City castle = new City();
        
        //create walls
        new Wall(castle, 1, 1, Direction.EAST);
        new Wall(castle, 1, 1, Direction.WEST);
        new Wall(castle, 1, 1, Direction.SOUTH);
        new Wall(castle, 1, 1, Direction.NORTH);
        new Wall(castle, 1, 4, Direction.EAST);
        new Wall(castle, 1, 4, Direction.WEST);
        new Wall(castle, 1, 4, Direction.SOUTH);
        new Wall(castle, 1, 4, Direction.NORTH);
        new Wall(castle, 4, 1, Direction.EAST);
        new Wall(castle, 4, 1, Direction.WEST);
        new Wall(castle, 4, 1, Direction.SOUTH);
        new Wall(castle, 4, 1, Direction.NORTH);
        new Wall(castle, 4, 4, Direction.EAST);
        new Wall(castle, 4, 4, Direction.WEST);
        new Wall(castle, 4, 4, Direction.SOUTH);
        new Wall(castle, 4, 4, Direction.NORTH);
        new Wall(castle, 2, 3, Direction.EAST);
        new Wall(castle, 2, 2, Direction.WEST);
        new Wall(castle, 3, 2, Direction.SOUTH);
        new Wall(castle, 2, 2, Direction.NORTH);
        new Wall(castle, 3, 3, Direction.EAST);
        new Wall(castle, 3, 2, Direction.WEST);
        new Wall(castle, 3, 3, Direction.SOUTH);
        new Wall(castle, 2, 3, Direction.NORTH);
    
        //create a guard
        RobotSE guard = new RobotSE(castle, 0,1, Direction.EAST);
            
        //robot moves
            
}
}
