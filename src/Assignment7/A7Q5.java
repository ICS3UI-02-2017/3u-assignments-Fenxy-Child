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
    
    public static void chaotic(int e, int a,int n){
         for (int i = 0; i < e; i++) {
            int randNum = (int)(Math.random()*(n - a + 1))+ a;
            for (int j = 0; j < randNum; j++) {
                System.out.print("*");
            }
            System.out.println("");
            }
        }
    
    
    public static void main(String[] args) {
        // Scanner 
        Scanner input = new Scanner(System.in);
        
        // ask to type the number of asterisks and rows
        System.out.println("Please enter the number of rows.");
        
        // integer
        int c = input.nextInt();
        int d = 5;
        int b = 1;
        
        // run the chaotic method
        chaotic(c, b, d);
        
    }
}
