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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // ask to type the number of marks
        System.out.println("Please enter the number of marks.");
        
        // number of marks
        int students = input.nextInt();
        
        // create array
        double [] marks = new double[students];
        
        // ask to type all the marks
        System.out.println("Please enter all the marks.");
        
        // set marks[k] with a for loop
            for (int k = 0; k < marks.length; k++) {
                marks[k] = input.nextInt();
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
        
        int a = Math.round(students/2);
        System.out.println("The median mark is " + marks[a] + ".");
    }
}
