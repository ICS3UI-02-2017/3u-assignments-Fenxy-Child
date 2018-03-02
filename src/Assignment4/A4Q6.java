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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ask to type the limit speed
        System.out.println("Enter speed limit.");
        //use a scanner to read info
        Scanner input = new Scanner(System.in);
        //type the limit speed
        int lim = input.nextInt();
        //ask to type the actual car speed recorded
        System.out.println("Enter the recorded car speed.");
        //type the actual car speed recorded
        int car = input.nextInt();
        //calculate km/h over the limit
        int over = car - lim;
        if(over<=0){
            System.out.println("Congratulations, you are within the speed limit!");
        }else if(over <= 20&&over > 0){
            System.out.println("You are speeding and your fine is $100.");
        }else if(over>21&&over<=30){
            System.out.println("You are speeding and your fine is $270.");
        }else{
            System.out.println("You are speeding and your fine is $500.");
        }
    }
}
