/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author choij2116
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new city
        City seoul = new City();
        
        //new robot
        RobotSE hodori = new RobotSE(seoul, 1,1,Direction.EAST);
        
        //counted while loop
        int numberOfMoves = 5;
        //if there are still moves to do
        while(numberOfMoves > 0){
            hodori.move();
            numberOfMoves = numberOfMoves - 1;
        }
        
        hodori.turnAround();
        
        //counting the other way
        numberOfMoves = 0;
        while(numberOfMoves < 5){
            hodori.move();
            numberOfMoves = numberOfMoves + 1;
        }
        
        hodori.turnAround();
        
        //use a for loop to move
        for(int count = 0; count < 5; count++){
            hodori.move();
            }
        
       int x = 10;
       x=x+5; //adds 5
       x+=5; //adds 5      
        
       x-=10; //subtracting 10 shortcut
       x=x-10;
       
       x*=2;
       x=x*2;
       
       x/=4;
       x = x / 4;
       
       //modulus or modulo
       int remainder = 5 % 2;
       int quotient = 5 / 2;
       
       if(hodori.frontIsClear()){
           if(hodori.canPickThing()){
               hodori.move();
           }
       }
       
       if(hodori.frontIsClear() && hodori.canPickThing()){
           hodori.move();
       }
    }
}