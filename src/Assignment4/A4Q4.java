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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ask the cost for food
        System.out.println("How much does the food for prom cost?");
        //use a scanner to read info
        Scanner input = new Scanner(System.in);
        //type the cost for food
        double food = input.nextDouble();
        //print out the cost for food
        System.out.println("$"+food);
        // ask the cost for DJ
        System.out.println("How much does the DJ cost?");
        //type the cost for DJ
        double DJ = input.nextDouble();
        //print out the cost for DJ
        System.out.println("$"+DJ);
        // ask the cost to rent the hall
        System.out.println("How much does it cost to rent the hall?");
        //type the cost for hall
        double hall = input.nextDouble();
        //print out the cost for hall
        System.out.println("$"+hall);
        // ask the cost for decoration
        System.out.println("How much does decorations cost?");
        //type the cost for deco
        double deco = input.nextDouble();
        //print out the cost for decoration
        System.out.println("$"+deco);
        // ask the cost for staff
        System.out.println("How much does it cost for staff?");
        //type the cost for staff
        double staff = input.nextDouble();
        //print out the cost for staff
        System.out.println("$"+staff);
        // ask the miscellaneous cost
        System.out.println("How much for miscellaneous costs?");
        //type the cost for miscellaneous
        double misc = input.nextDouble();
        //print out the miscellaneous cost
        System.out.println("$"+misc);
        
        //add all of cost and print out
        double total = food + DJ + hall + deco + staff + misc;
        double ticket = total / 35;
        double tickets = Math.ceil(ticket);
        System.out.println("The total cost is $" + total + ". You will need to sell " + tickets + " tickets to break even");
    }
}
