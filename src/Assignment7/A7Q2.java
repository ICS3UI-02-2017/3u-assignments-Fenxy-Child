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
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    
    // find the percent of the mark
    public static double examGrade(double a, double b){
        // calculate the percentage of the mark
        double percent = (a/b)*100;
        // send back to the double percent
        return percent;
        
    }
    
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);
        
        // ask to type your mark and total mark
        System.out.println("Please enter your mark and the total mark.");
        // double for your mark and the total mark
        double ur = input.nextDouble();
        double tot = input.nextDouble();
        
        // calculate the percent 
        double result = examGrade(ur, tot);
        // using the result from method examGrade, print out the grade
        if(result<50){
            System.out.println("Your exam grade is F.");
        }else if(result>=50 && result<60){
            System.out.println("Your exam grade is D.");
        }else if(result>=60 && result<70){
            System.out.println("Your exam grade is C.");
        }else if(result>=70 && result<80){
            System.out.println("Your exam grade is B.");
        }else if(result>=80){
            System.out.println("Your exam grade is A.");
        }
        
        
    }
}
