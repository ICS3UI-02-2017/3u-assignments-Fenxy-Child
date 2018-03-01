/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author choij2116
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ask value that wants to convert
        System.out.println("please enter the measurement in inches you wish to convert.");
        //use a scanner to read info
        Scanner input = new Scanner(System.in);
        // make a variable to convert in cm
        double inches = input.nextDouble();
        double cm = inches * 2.54;
        
        // show the result
        System.out.println(inches + " inches is the same as" + cm + " cm.");
        
    }
}
