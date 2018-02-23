/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author choij2116
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City seoul = new City();
        
        //create a robot
        RobotSE karel = new RobotSE(seoul, 4, 0, Direction.EAST);
        
        //create stairs
        new Wall(seoul, 4,2,Direction.WEST);
        new Wall(seoul, 4,2,Direction.NORTH);
        new Wall(seoul, 3,3,Direction.WEST);
        new Wall(seoul, 3,3,Direction.NORTH);
        new Wall(seoul, 2,4,Direction.WEST);
        new Wall(seoul, 2,4,Direction.NORTH);
        new Wall(seoul, 2,5,Direction.NORTH);
        new Wall(seoul, 2,5,Direction.EAST);
        new Wall(seoul, 3,6,Direction.NORTH);
        new Wall(seoul, 3,6,Direction.EAST);
        new Wall(seoul, 4,7,Direction.NORTH);
        new Wall(seoul, 4,7,Direction.EAST);
        
        //create things
        new Thing(seoul,4,1);
        new Thing(seoul,3,2);
        new Thing(seoul,2,3);
        new Thing(seoul,1,4);
        
        //karel pick all things on each stairs and reach the highest point of the stairs
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.pickThing();
        
        //karel put things on each stairs and go down the stairs
        karel.move();
        karel.putThing();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
    }
}
