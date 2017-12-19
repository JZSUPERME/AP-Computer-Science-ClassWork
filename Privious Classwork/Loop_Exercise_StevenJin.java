package loop_exercise_stevenjin;

import java.util.Scanner;

/**author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/09/27
 * Brief instruction: This program is a star game.
 * version 4
 */

public class Loop_Exercise_StevenJin {

    public static void main(String[] args) {
        
        System.out.print("Please enter the number of the star in the final line(odd number): ");
        
        Scanner input = new Scanner(System.in);
        int i;
        int j;
        int k= input.nextInt();
        
        if(k%2==1&&k>=1){
            
        for (i=1;i<=(k-1)/2+1;i++)
        {
           for (j=1;j<=(k+1)/2-i;j++)
             System.out.print(" ");
           for (j=1;j<=k-(((k+1)/2-i)*2);j++)
             System.out.print("*");
        System.out.println();
        } 
           }
        
        else 
            System.out.println("Invalid input");
    }
}
    

