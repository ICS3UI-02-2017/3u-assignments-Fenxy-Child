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
    
    public static double compoundInterest(double r, double p,int n){
        double d = 1+r;
        double balance = p*(Math.pow(d,n));
        return balance;
    }
    
    
    
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // ask to enter the interest, and the initial amount
        System.out.println("Please enter the interest, and the initial amount.");
        double a = input.nextDouble();
        double b = input.nextDouble();
        
        // ask to enter the number of years
        System.out.println("Please enter the number of years.");
        int c = input.nextInt();
        
        // calculate the balance and print out
        System.out.println("The balance is " + Math.round((compoundInterest(a,b,c)* 100)/100.0) + " dollars.");
        
        
    }
}
