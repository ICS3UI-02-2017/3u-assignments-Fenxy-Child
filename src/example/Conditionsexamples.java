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

/**
 *
 * @author choij2116
 */
public class Conditionsexamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create city
        City seoul = new City();
        
        //create a robot
        RobotSE hodori = new RobotSE(seoul, 2, 1, Direction.EAST);
        
        //put thing
        new Thing(seoul, 2, 2);
        new Thing(seoul, 2, 4);
        
        //create a wall
        new Wall(seoul, 2, 5, Direction.EAST);
        
        //move until front is not clear
        while(hodori.frontIsClear()){
            //if fromt is clear, do this
            hodori.move();
        //is there something to pick up
        if(hodori.canPickThing())
            hodori.pickThing();
        }
        
        //when front is not clear
        hodori.turnRight();
        
        if(hodori.countThingsInBackpack()== 1){
            hodori.move();
        }else if(hodori.countThingsInBackpack()==2){
            hodori.move(2);
        }else{
            hodori.turnAround();
        }
        
    }
}
