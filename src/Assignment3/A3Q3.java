/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author choij2116
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City seoul = new City();
        
        //new robot
        RobotSE karel = new RobotSE(seoul, 1,1,Direction.EAST, 20);
        
        //city shows how many things there
        seoul.showThingCounts(true);
        
        //karel put all the seeds on 4 rows
        for (int count = 0; count < 20; count++) {
            karel.putThing();
            karel.move();
        if(karel.getAvenue()==5){
            karel.turnRight();
        }else if(karel.getAvenue()==1&&karel.getStreet()>1){
            karel.turnLeft();
        }
        }
    }
}
