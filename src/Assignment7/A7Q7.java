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
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    
    // program to find the first digit
    public static int firstDigit(int a){
        // set integer 'number' which is same as a
        int number = a;
        // use while to repeat until a<10
        while (a>=10){
            // remove last digits until the integer become less than 10
            a=a/10;
            // if a is less than 10
            if(a<10){
                // print out the first digit of the integer
                System.out.println("The first digit of the integer is " + a);
            }
        }
        // return the integer a 
        return number;
    }
    
    
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // ask to enter the integer
        System.out.println("Please type the integer.");
        
        // set integer
        int b = input.nextInt();
        
        // use the method firstDigit with the integer typen
        firstDigit(Math.abs(b));
        
    }
}
