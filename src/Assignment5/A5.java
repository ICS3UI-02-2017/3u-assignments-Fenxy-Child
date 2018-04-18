/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author choij2116
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Type words/sentences you want to translate in Ubbi Dubbi.");

        // Translate English to ubbi dubbi
        String english= input.nextLine();
        english = english.toLowerCase();
            // walk down the word looking for the vowel
            int length = english.length();
            //string transword
            String transWord = "";
            int i=0;
            
            if(!(english.startsWith("a")||english.startsWith("e")||english.startsWith("i")||english.startsWith("o")||english.startsWith("u"))){
                transWord = transWord + english;
            }
            // use for loop to go through the character
                if(english.charAt(i)=='a'||english.charAt(i)=='e'||english.charAt(i)=='i'||english.charAt(i)=='o'||english.charAt(i)=='u'){
                    transWord = english.replace("a|e|i|o|u", "uba|ube|ubi|ubo|ubu");
                }
                        
                for (int j = 1; j < length; j++) {
                    if(english.charAt(j-1)=='a'||english.charAt(j-1)=='e'||english.charAt(j-1)=='i'||english.charAt(j-1)=='o'||english.charAt(j-1)=='u'){
                        char e = english.charAt(j-1);    
                        transWord = english.replace(e + "", "ub" + e);
                         //add ub that the word start with vowel
            if(english.startsWith("a")||english.startsWith("e")||english.startsWith("i")||english.startsWith("o")||english.startsWith("u")){
                transWord = "ub" + transWord;
            }   
                        }
                        }
                    System.out.println(transWord);
        }    
}
