/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

/**
 *
 * @author choij2116
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // ask to type the number of marks
        System.out.println("Please enter the number of marks.");
        
        // number of marks
        int students = input.nextInt();
        
        // create array
        double [] marks = new double[students];
        
        // ask to type all the marks
        System.out.println("Please enter all the marks.");
        
        // use a for loop to swap and order from lowest to highest
        for (int i = 0; i <= marks.length; i++) {
            // set marks[i]
            marks[i] = input.nextInt();
            for (int j =1 ; j < (n-i); j++){
                // if statement and swap
            if(marks[j-1]>marks[j]){
                int temp = marks[j-1];
                marks[j-1] = marks[j];
                marks[j] = temp;
            }
            }
            }
        
        // use a for loop to print out in ascending order
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " , ");
        }
        
        int a = Math.round(students/2)
        System.out.println("The median mark is " + marks[a] + ".")
    }
}
