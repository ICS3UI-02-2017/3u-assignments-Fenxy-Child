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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);
        
        // ask to enter number of students and all the marks
        System.out.println("How many students are in the class?");
        
        // number of students and their scores
        int students = input.nextInt();
        double[] scores = new double[students];
        
        // ask to enter their marks
        System.out.println("Please enter all the marks.");
        
        // use a for loop to create arrays
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextDouble();
        }
        
        // use a for loop to find the highest mark
        double highest = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > highest){
                highest = scores[i];
            }
        }
        // use a for loop to find the lowest mark
        double lowest = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < lowest){
                lowest = scores[i];
            }
        }
        // use a for loop to calculate the total score
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            double score = scores[i];
            sum = sum + score;
        }
        // calculate the average score
        double average = sum/students;
        
        // print out the highest mark and the lowest mark, and the class average
        System.out.println("Highest mark is " + highest + ", the lowest mark is " + lowest + ", and the average of the class is  " + (Math.round(average * 100)/100.0));
        }
        
    }

