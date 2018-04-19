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
        
        // array
        int[] integer = new int[2];
        
        // get two integers
        integer[0] = input.nextInt();    
        integer[1] = input.nextInt();
        
        // if statement to order in ascending form
        if(integer[0]>integer[1]){
            // print out in ascending form
            System.out.println(integer[1] + "," + integer[0]); 
        }else if(integer[0]<integer[1]){
            // print out in ascending form
            System.out.println(integer[0] + "," + integer[1]);
        }
        
        
    }
        
    }

