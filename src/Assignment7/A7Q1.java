/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author choij2116
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    
    // Find circle area
    public static double circleArea(double r){
        double area = r*r*Math.PI; 
        // send back to the area
        return area;
    }
    
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);
        
        // ask to type the radius of the circle
        System.out.println("Please enter the radius of the circle in centimeter.");
        double radius = input.nextDouble();
        
        // calculate the area of circle by using circleArea method
        double a = circleArea(radius);
        System.out.println("The area of a circle with the radius " + radius + " is " + a + " cm^2.");
        
    }
}
