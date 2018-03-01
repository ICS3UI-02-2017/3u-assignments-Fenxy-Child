/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author choij2116
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ask to answer the name
        System.out.println("Please enter your name.");
        //use a scanner to read info
        Scanner input = new Scanner(System.in);
        //make a string to store a name
        String name = input.nextLine();
        //ask the total marks for the first test
        System.out.println("What was the first test out of?");
        //make a string to store the first total marks
        String firstT = input.nextLine();
        //ask the your marks for the first test
        System.out.println("What mark did you get?");
        // make a string to store your first marks
        String first = input.nextLine();
        //ask the total marks for the second test
        System.out.println("What was the second test out of?");
        //make a string to store the second total marks
        String secondT = input.nextLine();
        //ask the your marks for the second test
        System.out.println("What mark did you get?");
        // make a string to store your second marks
        String second = input.nextLine();
        //ask the total marks for the third test
        System.out.println("What was the third test out of?");
        //make a string to store the third total marks
        String thirdT = input.nextLine();
        //ask the your marks for the third test
        System.out.println("What mark did you get?");
        // make a string to store your third marks
        String third = input.nextLine();
        //ask the total marks for the fourth test
        System.out.println("What was the fourth test out of?");
        //make a string to store the fourth total marks
        String fourthT = input.nextLine();
        //ask the your marks for the fourth test
        System.out.println("What mark did you get?");
        // make a string to store your fourth marks
        String fourth = input.nextLine();
        //ask the total marks for the fifth test
        System.out.println("What was the fifth test out of?");
        //make a string to store the fifth total marks
        String fifthT = input.nextLine();
        //ask the your marks for the fifth test
        System.out.println("What mark did you get?");
        // make a string to store your fifth marks
        String fifth = input.nextLine();
        
        //print out the total marks
        System.out.println("Test score for " + name + ".");
        
    }
}
