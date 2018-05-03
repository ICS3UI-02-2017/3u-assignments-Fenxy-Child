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
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    
    // program to find the last digit of the integer
    public static int lastDigit(int a){
        a = a % 10;
        // print out the last digit
        System.out.println("The last digit of the integer is " + a);
        // return to a 
        return a;
    }
    
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // ask to type the integer
        System.out.println("Please type the integer to print out its last digit.");
        
        // integer
        int d = input.nextInt();
        
        // run the lastDigit method with the integer typed. 
        lastDigit(Math.abs(d));
        
        
    }
}
