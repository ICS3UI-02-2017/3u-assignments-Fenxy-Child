/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author choij2116
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);
        
        // create array
        double [] marks = new double[10];
        
        //ask to enter their marks
        System.out.println("Please type 10 marks to sort from the lowest to highest mark");
        
        
        // set marks[k] with a for loop
            for (int k = 0; k < marks.length; k++) {
                marks[k] = input.nextDouble();
        }
            
            
        // use a for loop to swap and order from lowest to highest
        for (int i = 0; i <= (marks.length-1); i++) {
            for (int j = (i+1) ; j < (marks.length); j++){
                // if statement and swap
            if(marks[i]>marks[j]){
                double temp = (int) marks[i];
                marks[i] = marks[j];
                marks[j] = temp;
            }
            }
            }
        
        // print out in ascending order

            System.out.println(Arrays.toString(marks));
        }
    }   
