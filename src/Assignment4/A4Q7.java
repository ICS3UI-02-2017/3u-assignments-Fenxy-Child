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
        //
        System.out.println("enter sum of dices.");
        //dice,starting points,current, and squares
        int dice = input.nextInt();
        //loops for the game
        if(dice<2||dice>12){
            System.out.println("You quit.");
        }
        while(dice>=2&&dice<=12){
            
        }
    }
}