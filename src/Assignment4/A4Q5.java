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
        double firstT = input.nextDouble();
        //ask the your marks for the first test
        System.out.println("What mark did you get?");
        // make a string to store your first marks
        double first = input.nextDouble();
        //ask the total marks for the second test
        System.out.println("What was the second test out of?");
        //make a string to store the second total marks
        double secondT = input.nextDouble();
        //ask the your marks for the second test
        System.out.println("What mark did you get?");
        // make a string to store your second marks
        double second = input.nextDouble();
        //ask the total marks for the third test
        System.out.println("What was the third test out of?");
        //make a string to store the third total marks
        double thirdT = input.nextDouble();
        //ask the your marks for the third test
        System.out.println("What mark did you get?");
        // make a string to store your third marks
        double third = input.nextDouble();
        //ask the total marks for the fourth test
        System.out.println("What was the fourth test out of?");
        //make a string to store the fourth total marks
        double fourthT = input.nextDouble();
        //ask the your marks for the fourth test
        System.out.println("What mark did you get?");
        // make a string to store your fourth marks
        double fourth = input.nextDouble();
        //ask the total marks for the fifth test
        System.out.println("What was the fifth test out of?");
        //make a string to store the fifth total marks
        double fifthT = input.nextDouble();
        //ask the your marks for the fifth test
        System.out.println("What mark did you get?");
        // make a string to store your fifth marks
        double fifth = input.nextDouble();
        
        //calculate the marks for each tests
        double per1 = first / firstT * 100;
        double per2 = second / secondT * 100;
        double per3 = third / thirdT * 100;
        double per4 = fourth / fourthT * 100;
        double per5 = fifth / fifthT * 100;
        double aver = (per1+per2+per3+per4+per5)/5;
        
        //print out the total marks
        System.out.println("Test scores for " + name + ".");
        System.out.println("Test 1: " + per1 + " % ");
        System.out.println("Test 2: " + per2 + " % ");
        System.out.println("Test 3: " + per3 + " % ");
        System.out.println("Test 4: " + per4 + " % ");
        System.out.println("Test 5: " + per5 + " % ");
        System.out.println("Average: " + aver + " % ");
        
    }
}
