/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author choij2116
 */
public class A2Q2Writtien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a city
        City seoul = new City();
        
        //create a robot
        RobotSE karel= new RobotSE(seoul,1,5,Direction.EAST);
        
        while(karel.getAvenue()!=0 || karel.getStreet()!=0){
            karel.move();
        if(karel.getAvenue()==0){
            karel.turnRight();
        }
        }
    }
}
