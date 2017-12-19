package intergeraverage_steven_jin;

import java.util.Scanner;

/**
 * @author Steven Jin - Class AP S3C7
 * Instructor: Daniel Gunn
 * Date:2017/09/19
 * This program is used to calculate the average among 5 integers.
 */
public class IntergerAverage_Steven_Jin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    //User imput 5 values
    double sum = 0.0;
    System.out.print("Enter number 1: ");
    sum = sum + input.nextDouble();
    System.out.print("Enter number 2: ");
    sum = sum + input.nextDouble();  
    System.out.print("Enter number 3: ");
    sum = sum + input.nextDouble();
    System.out.print("Enter number 4: ");
    sum = sum + input.nextDouble();
    System.out.print("Enter number 5: ");
    sum = sum + input.nextDouble();
    
    System.out.println("Average = " + sum/5);
    }
    
}
