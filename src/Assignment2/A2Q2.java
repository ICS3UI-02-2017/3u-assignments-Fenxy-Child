/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author choij2116
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create city
        City seoul = new City();
        
        //create a robot
        RobotSE karel = new RobotSE(seoul,2,0,Direction.EAST);
        
        //create hurdles
        new Wall(seoul,2,0,Direction.SOUTH);
        new Wall(seoul,2,0,Direction.EAST);
        new Wall(seoul,2,1,Direction.SOUTH);
        new Wall(seoul,2,2,Direction.SOUTH);
        new Wall(seoul,2,3,Direction.SOUTH);
        new Wall(seoul,2,4,Direction.SOUTH);
        new Wall(seoul,2,5,Direction.SOUTH);
        new Wall(seoul,2,6,Direction.SOUTH);
        new Wall(seoul,2,7,Direction.SOUTH);
        new Wall(seoul,2,8,Direction.SOUTH);
        new Wall(seoul,2,1,Direction.EAST);
        new Wall(seoul,2,3,Direction.EAST);
        new Wall(seoul,2,6,Direction.EAST);
        
        //create finish line
        new Thing(seoul,2,8);
        
        //karel jumps hurdles
    while(!karel.canPickThing()){
        if(!karel.frontIsClear()){
            karel.turnLeft();
            karel.move();
            karel.turnRight();
            karel.move();
            karel.turnRight();
            karel.move();
            karel.turnLeft();
        }else if(karel.canPickThing()){
            karel.turnRight();
        }else if(karel.frontIsClear()){
            karel.move();
        }
        }
    }
    }

