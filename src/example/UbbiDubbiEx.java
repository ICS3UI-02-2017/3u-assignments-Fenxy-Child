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
public class UbbiDubbiEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            // get the word to translate
            System.out.println("Enter a word to translate");
            String origWord = input.nextLine();
            //sanitire the input
            origWord = origWord.toLowerCase();
            
            //do we start with a vowel
            if(origWord.startsWith("a")||origWord.startsWith("e")||origWord.startsWith("i")||origWord.startsWith("o")||origWord.startsWith("u")){
            //stick ay on the end
                String transWord = origWord + "ay";
                System.out.println(origWord + " in Pig Latin is " + origWord + "ay");
            }else{
                // walk down the word looking for the vowel
                int length = origWord.length();
                // use for loop to go through the character
                for (int i = 0; i < length; i++) {
                    //look at the character at position i, is a vowel?
                    if(origWord.charAt(i)=='a'||origWord.charAt(i)=='e'||origWord.charAt(i)=='i'||origWord.charAt(i)=='o'||origWord.charAt(i)=='u'){
                        // i is the position of the vowel
                        String start = origWord.substring(0, i);
                        String end = origWord.substring(i);
                        
                        //compute translated word
                        String transWord = end + start + "ay";
                        System.out.println(origWord + " in Pig Latin is " + transWord);
                    //done looking so stop the for loop
                        break;
                    }
                }
            }
        }
    }
}
