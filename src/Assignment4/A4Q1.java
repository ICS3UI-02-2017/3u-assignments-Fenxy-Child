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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ask to answer the name
        System.out.println("Please enter your name.");
        //use a scanner to read info
        Scanner input = new Scanner(System.in);
        //make a string to store a name
        String name = input.nextLine();
        
        //say hello
        System.out.println("Hello "+name+" how are you today?");
    }
}
