/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.ArrayList;

/**
 *
 * @author choij2116
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // array list
        ArrayList <Boolean> primeList;
        
        // set integer n as 1000 
        int n = 1000;
        
        // if n<=1, end
        if(n<=1) return;
        
        // Assigned as n+1
        primeList = new ArrayList<Boolean>(n+1);
        // deal with 0 and 1 is not a prime number\
        primeList.add(false);
        primeList.add(false);
        
        // use a for loop to set the numbers from 2 to n as prime numbers
        for (int i = 2; i <= n; i++) {
            primeList.add(i, true);
        }
        
        // deleting the multiples from 2 to i*i <= n
        for (int i = 2; (i*i) < n; i++) {
            if(primeList.get(i)){
                for (int j = i*i; j <= n; j+=i) primeList.set(j,false);
            }
        }
        // add curly bracket at the beginning of the list
        StringBuffer a = new StringBuffer();
        a.append("{");
        // using a for loop to add comma right after the prime number
        for (int i = 0; i <= n; i++) {
            if(primeList.get(i) == true){
		a.append(i);
		a.append(",");
            }
	}
        // add curly bracket at the end of the list
        a.setCharAt(a.length()-1, '}');
        // print out the all prime numbers between 2 and 1000
        System.out.println(a.toString());
    }
}
