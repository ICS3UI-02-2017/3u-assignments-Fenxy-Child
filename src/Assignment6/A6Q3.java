/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author choij2116
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);
        
        // ask to enter two integer
        
        System.out.println("Please type two integers that you want to place in ascending order.");
        int A = input.nextInt();
        int C = input.nextInt();
        
        
        // if statement to place in ascending order
        if(A>C){
            System.out.println("The integers in ascending order are " + C + " , " + A);
        }else if(A<C||A==C){
            System.out.println("The integers in ascending order are " + A + " , " + C);
        }
        
    }
}
