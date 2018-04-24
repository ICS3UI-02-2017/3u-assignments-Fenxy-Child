/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.Scanner;

/**
 *
 * @author choij2116
 */
public class Methodexample {

    // the helloWorld method to say hello
    public static void helloWorld(){
        System.out.println("Hello world!");
    }
    
    // say hello to a user
    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }
   
    // calculate the positive root of quadratic formula
    public static double posQuadFormula(double a, double b, double c){
        double discrim = b*b - 4*a*c;
        double root = (-b + Math.sqrt(discrim))/(2*a);
        // send back the root
        return root;
    }
    
    // calculate the positive root of quadratic formula
    public static double[] quadFormula(double a, double b, double c){
        // create the arry to store both roots
        double[]roots = new double[2];
        // calculate the roots
        double discrim = b*b - 4*a*c;
        roots[0] = (-b + Math.sqrt(discrim))/(2*a);
        roots[1] = (-b - Math.sqrt(discrim))/(2*a);
        // send back the root
        return roots;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);
        // call the helloWorld method
        helloWorld();
        
        System.out.println("What is your name?");
        String user = input.nextLine();
        sayHello(user);
        
        //calculate the positive root of x^2-5x-50
        double pRoot = posQuadFormula(1, -5, -50);
        System.out.println("The positive root is " + pRoot);
        
        //calculate roots of x^2-5x-50
        double[] roots = quadFormula(1, -5, -50);
        System.out.println("The roots are " + roots[0] + " and " + roots[1]);
        
    }
}
