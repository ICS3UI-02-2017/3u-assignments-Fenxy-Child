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

        int current = 1;
        //loops for the game
        while (current < 100) {
            //ask to enter sum of dices
            System.out.println("enter sum of dices.");
            //dice and current location
            int dice = input.nextInt();
            
            current = dice + current;
            if (dice < 2 || dice > 12) {
                    System.out.println("You quit.");}
            if (dice >= 2 && dice <= 12) {
                if (current == 9) {
                    current = 34;
                } else if (current == 40) {
                    current = 64;
                } else if (current == 67) {
                    current = 86;
                } else if (current == 54) {
                    current = 19;
                } else if (current == 90) {
                    current = 48;
                } else if (current == 99) {
                    current = 77;
                }if (current >= 100) {
                    System.out.println("you win!");
                }System.out.println("You are now on square " + current);
            }
        }
        }
        }
    
