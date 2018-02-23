/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author choij2116
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new city
        City seoul = new City();
        
        //create a robot
        RobotSE karel = new RobotSE(seoul,0,2,Direction.WEST);
        
        //create a square
        new Wall(seoul, 1,1,Direction.WEST);
        new Wall(seoul, 1,1,Direction.NORTH);
        new Wall(seoul, 2,1,Direction.WEST);
        new Wall(seoul, 2,1,Direction.SOUTH);
        new Wall(seoul, 2,2,Direction.SOUTH);
        new Wall(seoul, 2,2,Direction.EAST);
        new Wall(seoul, 1,2,Direction.EAST);
        new Wall(seoul, 1,2,Direction.NORTH);
        
        //go around the square exactly 2 time
        for (int count = 0; count < 8; count++) {
            karel.move(2);
            karel.turnLeft();
            karel.move();
        }
    }
}
