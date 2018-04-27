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
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    
    public static int chaotic(int n, int a){
         int randNum = (int)(Math.random()*(n - a + 1))+ a;
         for (n = 0; n <= randNum; n++) {
             System.out.println("*");
            }
         return randNum;
        }
    
    
    public static void main(String[] args) {
        // Scanner 
        Scanner input = new Scanner(System.in);
        
        // ask to type the number of asterisks and rows
        System.out.println("Please enter the number of total asterisks and rows.");
        
        // integer
        int d = input.nextInt();
        int b = input.nextInt();
        
        chaotic(d, b);
        
    }
}
