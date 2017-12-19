package forgetmenot_StevenJin;

import java.util.Scanner;

/**@author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/10/19
 * Brief instruction: This program is a forget me not program.
 */
public class ForgetMeNot_StevenJin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the times you miss him or her: ");
        int number=in.nextInt();
        missYou(number);
        System.out.println("Love, me.");
    }
    public static void missYou(int n){
        if (n==0)
        return;
        System.out.println("I miss you!!");
        missYou(n-1);
        return;
                    
    }
    
}
