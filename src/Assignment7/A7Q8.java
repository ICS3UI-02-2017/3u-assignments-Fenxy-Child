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
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    
    public static boolean allDigitOdd(int n){
        while(n>0){
            int digit = n % 10;
            n = n / 10;
            
            if(digit % 2 == 0){
                // all digit are not odd
                return false;
            }
        }
        // all digit are odd
        return true;
    }
    
    
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // ask to type the integer
        System.out.println("Please type the integer.");
        
        // set integer
        int a = input.nextInt();
        
        // print out true or false that integer has all odd digits 
        System.out.println("does integer " + a + " have all odd digits?");
        System.out.println(allDigitOdd(a));
        
        
    }
}
