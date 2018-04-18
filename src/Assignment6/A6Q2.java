/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author choij2116
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);
        
        // ask the number of people
        System.out.println("How many people did you measured their heights?");
        // create values of number of people and their heights
        int peop = input.nextInt();
        double[] heights = new double[peop];
        // ask to enter their heights
        System.out.println("Please enter all of their heights. Please enter in cm.");
        
        // use a for loop to create arrays
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }
        // create value called "sum" (total heights)
        double sum = 0;
        // use a for loop to calculate their total heights
        for (int i = 0; i < heights.length; i++) {
            double height = heights[i];
            sum = sum + height;
        }
        // calculate the average height
        double aver = sum/peop;
        
        //Print out the average height
        System.out.println("The average height of the people is " + aver + " cm.");
        
    }
}
