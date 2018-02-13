/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1.newpackage;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author choij2116
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //create a city
        City seoul = new City();
        
        //create a robot
        RobotSE hodori = new RobotSE(seoul, 0, 0, Direction.SOUTH);
        RobotSE second = new RobotSE(seoul, 0, 1, Direction.SOUTH);
        
        //create walls
        new Wall(seoul, 0, 1, Direction.WEST);
        new Wall(seoul, 1, 1, Direction.WEST);
        new Wall(seoul, 1, 1, Direction.SOUTH);
        
        //they move
        hodori.move(2);
        second.move();
        second.turnLeft();
        hodori.turnLeft();
        second.move();
        second.turnRight();
        second.move();
        second.turnRight();
        hodori.move();
        second.move();        
        
    }
}
