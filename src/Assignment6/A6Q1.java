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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
       
        // ask the number of students in class
        System.out.println("How many students in the class?");
        
        // number of students and their scores
        int students = input.nextInt();
        double[] score = new double[students]; 
        // ask to type their marks
        System.out.println("Please enter all the marks");
        
        // use a for loop to create arrays
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextDouble();
        }
        //create a value of sum (total scores)
        double sum = 0;
        // use a for loop to calculate the total scores
        for (int i = 0; i < score.length; i++) {
            double scores = score[i];
            sum = sum + scores;
        }
        // calculate the class average
        double average = sum/students;
        // print out the class average
        System.out.println("The class average is " + (Math.round(average * 100)/100.0));
    }
}
