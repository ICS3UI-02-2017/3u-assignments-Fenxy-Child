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
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    
    // find the factors 
    public static int factors(int a){
        System.out.println("Factors of " + a + " are ");
        for (int i = 1; i <= a; ++i) {
            if(a % i == 0){
                System.out.println(i);
            }
        }return a;
    }
    
    
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // ask to type the integer
        System.out.println("Please type the integer that is bigger than 1 to find the factors.");
        int in = input.nextInt();
        
        // if statement if integer that was typen is equal or smaller than 1
        if(in<=1){
            System.out.println("undefined.");
        }
        
        // find and print out the factors 
        factors(in);
    }
}
