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
        int current = dice + dice;
        //loops for the game
        while(dice<=0||dice>12){
            System.out.println("Try again.");
        }
        while(dice>=1&&dice<=12){
            
        }
    }
}