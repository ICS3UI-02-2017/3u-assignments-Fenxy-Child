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
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    
    // program to print out random number of asterisks
    public static void chaotic(int e, int a,int n){
         // use a for loop to repeat until it print out the last row 
         for (int i = 0; i < e; i++) {
            // set the formula for the random number 
            int randNum = (int)(Math.random()*(n - a + 1))+ a;
            // for loop to repeat printing out the random numbers of asterisks in one row
            for (int j = 0; j < randNum; j++) {
                // print out asterisks
                System.out.print("*");
            }
            // go to nextline and repeat printing out
            System.out.println("");
            }
        }
    
    
    public static void main(String[] args) {
        // Scanner 
        Scanner input = new Scanner(System.in);
        
        // ask to type the number of asterisks and rows
        System.out.println("Please enter the number of rows.");
        
        // set integers for number of rows
        int c = input.nextInt();
        
        // run the chaotic method with maximum 5 and minimum 1 asterisks in one row
        chaotic(c, 1, 5);
        
    }
}
