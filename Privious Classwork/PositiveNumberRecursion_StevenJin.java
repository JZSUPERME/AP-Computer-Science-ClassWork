package positivenumberrecursion_stevenjin;

import java.util.Scanner;
        
/**
 *@author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/10/19
 * Brief instruction: This program is a practice recursion program.
 */
public class PositiveNumberRecursion_StevenJin {
    
    public static int getPos(){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive number: ");
        int number = input.nextInt();
        
        if (number>0)
            return number;
        else 
            return getPos();     
    }
 
    public static void main(String[] args) {
        
        System.out.println("The final answer is "+getPos());
    }
    
}
