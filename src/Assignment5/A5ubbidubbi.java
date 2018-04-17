/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author wise0
 */
public class A5ubbidubbi {

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
            String transWord = "" + english;
            // add "ub" if it starts with the vowel
            if(english.startsWith("a")||english.startsWith("e")||english.startsWith("i")||english.startsWith("o")||english.startsWith("u")){
                transWord = "ub";
            }
            // use for loop to go through the character
                for (int i = 0; i < length; i++) {
                    if(english.charAt(i)=='a'||english.charAt(i)=='e'||english.charAt(i)=='i'||english.charAt(i)=='o'||english.charAt(i)=='u'){        
                        String a = english.substring(0,i);
                        String b = english.substring(i);
                        transWord = transWord + a + "ub" + b ;
                        
                    }
                }System.out.println(transWord);
    }
    }
    

