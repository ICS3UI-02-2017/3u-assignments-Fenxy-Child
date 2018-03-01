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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ask to enter 4 numbers
        System.out.println("please enter 4 numbers on separate line");
        //use a scanner to read info
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double number4 = input.nextDouble();
        //print out numbers
        System.out.println("Your numbers are " + number1 + ", "+ number2 + ", "+ number3 + " and "+ number4 + ".");
    }
}
