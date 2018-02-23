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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City seoul = new City();
        
        //new robot
        RobotSE karel = new RobotSE(seoul,3,3,Direction.SOUTH);
        
        
        
    }
}
