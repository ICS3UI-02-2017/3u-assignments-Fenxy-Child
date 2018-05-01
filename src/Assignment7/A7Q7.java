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
    
    public static int firstDigit(int a){
        // remove last digits until the integer become less than 10
        int number = a;
        while (a>=10){
            a=a/10;
            if(a<10){
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
        firstDigit(b);
        
    }
}
