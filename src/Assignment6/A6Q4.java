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
        
        // set 10 marks 
        marks[0] = input.nextInt();
        marks[1] = input.nextInt();
        marks[2] = input.nextInt();
        marks[3] = input.nextInt();
        marks[4] = input.nextInt();
        marks[5] = input.nextInt();
        marks[6] = input.nextInt();
        marks[7] = input.nextInt();
        marks[8] = input.nextInt();
        marks[9] = input.nextInt();
        
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]>marks[i+1]){
                
                
            }
            }
        }
        
    }
