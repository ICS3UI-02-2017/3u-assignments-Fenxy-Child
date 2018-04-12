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
        int peop = input.nextInt();
        double[] heights = new double[peop];
        System.out.println("Please enter all of their heights. Please enter in cm.");
        
        // use a for loop for input
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            double height = heights[i];
            sum = sum + height;
        }
        double aver = sum/peop;
        
        //Print out the average height
        System.out.println("The average height of the people is " + aver + " cm.");
        
    }
}
