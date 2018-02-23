/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author choij2116
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City seoul = new City();
        
        //create a robot
        RobotSE hodori = new RobotSE(seoul,1,1,Direction.EAST);
                
        //create 10 things
        new Thing(seoul,1,1);
        new Thing(seoul,1,1);
        new Thing(seoul,1,1);
        new Thing(seoul,1,1);
        new Thing(seoul,1,1);
        new Thing(seoul,1,1);
        new Thing(seoul,1,1);
        new Thing(seoul,1,1);
        new Thing(seoul,1,1);
        new Thing(seoul,1,1);
        
        //city shows how many things there
        seoul.showThingCounts(true);
        
        //robot pick thing and put it for 10 times
        for (int count = 0; count < 9; count++) {
            hodori.pickThing();
            hodori.move();
            hodori.putThing();
            hodori.turnAround();
            hodori.move();
            hodori.turnAround();
        }for(int count = 9; count < 10; count++) {
            hodori.pickThing();
            hodori.move();
            hodori.putThing();
        }
        
    }
}
