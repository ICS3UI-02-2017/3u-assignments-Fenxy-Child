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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //use a scanner to read info
        Scanner input = new Scanner(System.in);
        //dice,starting points,current, and squares
        int dice = input.nextInt();
        int starting = 1;
        int square1 = dice + starting;
        int square2 = dice + square1;
        int current = dice + square2;
        // loops for the game
        while(current < 100){
            System.out.println("Enter sum of dice");
        }
    }
}
