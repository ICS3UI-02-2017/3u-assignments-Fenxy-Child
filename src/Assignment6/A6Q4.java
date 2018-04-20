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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);
        
        // create array
        int [] marks = new int[10];
        
        //ask to enter their marks
        System.out.println("Please type 10 marks to sort from the lowest to highest mark");
        
        
        // use a for loop to swap and order from lowest to highest
        for (int i = 0; i < marks.length; i++) {
            // set marks[i]
            marks[i] = input.nextInt();
            // if statement and swap
            if(marks[i]>marks[i+1]){
                int temp = marks[i];
                marks[i] = marks[i+1];
                marks[i+1] = temp;
            }else if(marks[i]<=marks[i+1]){
                return;
            }
            }
        // use a for loop to print out in ascending order
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " , ");
        }
        }
    }   
