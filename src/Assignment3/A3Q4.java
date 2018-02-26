/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author choij2116
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City seoul = new City();
        
        //new robot
        RobotSE karel = new RobotSE(seoul,3,3,Direction.SOUTH);
        
        //Create 4 squares
        new Wall(seoul,1,1,Direction.NORTH);
        new Wall(seoul,1,2,Direction.NORTH);
        new Wall(seoul,4,1,Direction.NORTH);
        new Wall(seoul,4,2,Direction.NORTH);
        new Wall(seoul,1,4,Direction.NORTH);
        new Wall(seoul,1,5,Direction.NORTH);
        new Wall(seoul,4,4,Direction.NORTH);
        new Wall(seoul,4,5,Direction.NORTH);
        new Wall(seoul,1,1,Direction.WEST);
        new Wall(seoul,2,1,Direction.WEST);
        new Wall(seoul,4,1,Direction.WEST);
        new Wall(seoul,5,1,Direction.WEST);
        new Wall(seoul,1,4,Direction.WEST);
        new Wall(seoul,2,4,Direction.WEST);
        new Wall(seoul,4,4,Direction.WEST);
        new Wall(seoul,5,4,Direction.WEST);
        new Wall(seoul,2,1,Direction.SOUTH);
        new Wall(seoul,2,2,Direction.SOUTH);
        new Wall(seoul,5,1,Direction.SOUTH);
        new Wall(seoul,5,2,Direction.SOUTH);
        new Wall(seoul,2,4,Direction.SOUTH);
        new Wall(seoul,2,5,Direction.SOUTH);
        new Wall(seoul,5,4,Direction.SOUTH);
        new Wall(seoul,5,5,Direction.SOUTH);
        new Wall(seoul,1,2,Direction.EAST);
        new Wall(seoul,2,2,Direction.EAST);
        new Wall(seoul,4,2,Direction.EAST);
        new Wall(seoul,5,2,Direction.EAST);
        new Wall(seoul,1,5,Direction.EAST);
        new Wall(seoul,2,5,Direction.EAST);
        new Wall(seoul,4,5,Direction.EAST);
        new Wall(seoul,5,5,Direction.EAST);
        
        
    }
}
