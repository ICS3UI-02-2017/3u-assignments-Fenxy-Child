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
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    
    // program to find the balance with the interest, initial amount, and number of years
    public static double compoundInterest(double r, double p,int n){
        // calculate by using formula B=P(1+r)^n
        // set double d for 1+r
        double d = 1+r;
        double balance = p*(Math.pow(d,n));
        // send back to the double balance
        return balance;
    }
    
    
    
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // ask to enter the interest, and the initial amount
        System.out.println("Please enter the interest, and the initial amount.");
        
        // set doubles for interests and initial amount typen
        double a = input.nextDouble();
        double b = input.nextDouble();
        
        // ask to enter the number of years
        System.out.println("Please enter the number of years.");
        // set integer for the number of year typen
        int c = input.nextInt();
        
        // calculate the balance and print out
        System.out.println("The balance is " + Math.round((compoundInterest(a,b,c)* 100)/100.0) + " dollars.");
        
        
    }
}
