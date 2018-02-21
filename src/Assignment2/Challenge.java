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
import java.awt.Color;

/**
 *
 * @author choij2116
 */
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a city
        City seoul = new City();
        
        //new Robots
        RobotSE karel = new RobotSE(seoul, 0,2,Direction.SOUTH);
        RobotSE tina = new RobotSE(seoul, 0,2,Direction.SOUTH);
        
        //create snows(things)
        new Thing(seoul,0,1);
        new Thing(seoul,0,3);
        new Thing(seoul,0,4);
        new Thing(seoul,0,6);
        new Thing(seoul,1,0);
        new Thing(seoul,1,3);
        new Thing(seoul,1,4);
        new Thing(seoul,1,5);
        new Thing(seoul,1,7);
        new Thing(seoul,2,0);
        new Thing(seoul,2,2);
        new Thing(seoul,2,4);
        new Thing(seoul,2,6);
        new Thing(seoul,3,0);
        new Thing(seoul,3,1);
        new Thing(seoul,3,4);
        new Thing(seoul,3,6);
        new Thing(seoul,4,0);
        new Thing(seoul,4,2);
        new Thing(seoul,4,3);
        new Thing(seoul,4,4);
        new Thing(seoul,4,6);
        new Thing(seoul,4,7);
        new Thing(seoul,5,1);
        new Thing(seoul,5,5);
        new Thing(seoul,5,7);
        new Thing(seoul,6,4);
        new Thing(seoul,6,6);
        new Thing(seoul,7,0);
        new Thing(seoul,7,1);
        new Thing(seoul,7,2);
        new Thing(seoul,7,3);
        new Thing(seoul,7,7);
        new Thing(seoul,8,1);
        new Thing(seoul,8,3);
        new Thing(seoul,8,4);
        new Thing(seoul,8,6);
        new Thing(seoul,9,0);
        new Thing(seoul,9,1);
        new Thing(seoul,9,3);
        new Thing(seoul,9,4);
        new Thing(seoul,9,6);

        //border line for Roads,sidewalk,and driveway
        new Wall(seoul,0,0,Direction.WEST);
        new Wall(seoul,1,0,Direction.WEST);
        new Wall(seoul,2,0,Direction.WEST);
        new Wall(seoul,3,0,Direction.WEST);
        new Wall(seoul,4,0,Direction.WEST);
        new Wall(seoul,5,0,Direction.WEST);
        new Wall(seoul,6,0,Direction.WEST);
        new Wall(seoul,7,0,Direction.WEST);
        new Wall(seoul,8,0,Direction.WEST);
        new Wall(seoul,9,0,Direction.WEST);
        new Wall(seoul,0,1,Direction.EAST);
        new Wall(seoul,1,1,Direction.EAST);
        new Wall(seoul,2,1,Direction.EAST);
        new Wall(seoul,3,1,Direction.EAST);
        new Wall(seoul,4,1,Direction.EAST);
        new Wall(seoul,5,1,Direction.EAST);
        new Wall(seoul,6,1,Direction.EAST);
        new Wall(seoul,7,1,Direction.EAST);
        new Wall(seoul,8,1,Direction.EAST);
        new Wall(seoul,9,1,Direction.EAST);
        new Wall(seoul,0,2,Direction.EAST);
        new Wall(seoul,3,2,Direction.EAST);
        new Wall(seoul,5,2,Direction.EAST);
        new Wall(seoul,6,2,Direction.EAST);
        new Wall(seoul,9,2,Direction.EAST);
        new Wall(seoul,1,6,Direction.EAST);
        new Wall(seoul,2,6,Direction.EAST);
        new Wall(seoul,4,5,Direction.EAST);
        new Wall(seoul,7,7,Direction.EAST);
        new Wall(seoul,8,7,Direction.EAST);
        new Wall(seoul,1,3,Direction.NORTH);
        new Wall(seoul,1,4,Direction.NORTH);
        new Wall(seoul,1,5,Direction.NORTH);
        new Wall(seoul,1,6,Direction.NORTH);
        new Wall(seoul,4,3,Direction.NORTH);
        new Wall(seoul,4,4,Direction.NORTH);
        new Wall(seoul,4,5,Direction.NORTH);
        new Wall(seoul,7,3,Direction.NORTH);
        new Wall(seoul,7,4,Direction.NORTH);
        new Wall(seoul,7,5,Direction.NORTH);
        new Wall(seoul,7,6,Direction.NORTH);
        new Wall(seoul,7,7,Direction.NORTH);
        new Wall(seoul,2,3,Direction.SOUTH);
        new Wall(seoul,2,4,Direction.SOUTH);
        new Wall(seoul,2,5,Direction.SOUTH);
        new Wall(seoul,2,6,Direction.SOUTH);
        new Wall(seoul,4,3,Direction.SOUTH);
        new Wall(seoul,4,4,Direction.SOUTH);
        new Wall(seoul,4,5,Direction.SOUTH);
        new Wall(seoul,8,3,Direction.SOUTH);
        new Wall(seoul,8,4,Direction.SOUTH);
        new Wall(seoul,8,5,Direction.SOUTH);
        new Wall(seoul,8,6,Direction.SOUTH);
        new Wall(seoul,8,7,Direction.SOUTH);
        new Wall(seoul,9,2,Direction.SOUTH);
        
        //Robots set colors and initials
        karel.setColor(Color.yellow);
        tina.setColor(Color.pink);
        karel.setLabel("K");
        tina.setLabel("T");
        
        //tina shovel the snows
        while(tina.getStreet()<9){
        if(tina.canPickThing()){
            tina.pickThing();
        }else if(tina.getStreet()==1||tina.getStreet()==4||tina.getStreet()==7){
            tina.turnLeft();
        }else if(tina.getStreet()==2||tina.getStreet()==8){
            tina.turnRight();
        }else if(!tina.frontIsClear()){
            tina.turnRight();
        }else if(tina.frontIsClear()){
            tina.move();
        }else if(tina.getAvenue()==2){
            tina.putAllThings();
        }
        }
        
        //karel shovel the snows
        while(karel.frontIsClear()){
            karel.move();
        if(karel.canPickThing()){
            karel.pickThing();
        }else if(!karel.frontIsClear()){
            karel.putThing();
        }
        
    }
    }
}
