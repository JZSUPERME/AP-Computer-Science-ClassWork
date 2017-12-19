package reverseanumber_stevenjin;

import java.util.Scanner;

/**@author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/10/31
 * Brief instruction: This program is a reverse number program.
 */
public class ReverseANumber_StevenJin {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Enter how many digit in your sequence: ");
    int d=input.nextInt();
    System.out.print("Enter your number sequence: ");
    int a=input.nextInt();
    reversenumber(a,d);
    System.out.println(reversenumber(a,d));
    }
    public static int reversenumber(int a,int d){
        if (d==1)
            return a;
        return reversenumber(a/10,d-1)+(a%10)*(int)Math.pow(10,d-1);
    }
}
