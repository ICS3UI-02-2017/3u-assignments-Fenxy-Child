/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.Scanner;

/**
 *
 * @author choij2116
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner 
        Scanner input = new Scanner(System.in);
        
        //make an array to store expenses
        double[] expenses = new double[6];
        
        // let the user know to get the costs
        System.out.println("Please enter the six costs for prom.");
        //use a for loop for input
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = input.nextDouble();    
        }
        
        // adding all the expenses
        double sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            // get the expense
            double expense = expenses[i];
            // add it to the sum
            sum = sum + expense;
        }
        // output
        System.out.println("prom costs " + sum);
        // take the sum, divide by 35, always round up
        double ticketNeeded = Math.ceil(sum/35);
        System.out.println("Need to sell " + ticketNeeded + " dollars.");
    }
}
