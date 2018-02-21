/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author choij2116
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a city
        City seoul = new City();
        
        //create a robot
        RobotSE hodori = new RobotSE (seoul,1,1,Direction.EAST);
        
        //create things
        new Thing(seoul,1,2);
        new Thing(seoul,1,3);
        new Thing(seoul,1,4);
        new Thing(seoul,1,5);
        new Thing(seoul,1,6);
        new Thing(seoul,1,7);
        new Thing(seoul,1,8);
        new Thing(seoul,1,9);
        new Thing(seoul,1,10);
        new Thing(seoul,1,11);
        
        hodori.move();
        
        //pick things until 7 in the bag
        while(hodori.countThingsInBackpack()<7){
            hodori.pickThing();
            hodori.move();
        }
        
        if(hodori.countThingsInBackpack()==7){
            hodori.move(3);
        }
        
    }
}
