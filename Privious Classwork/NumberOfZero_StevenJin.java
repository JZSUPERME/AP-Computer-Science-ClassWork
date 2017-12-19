package numberofzero_stevenjin;

import java.util.Scanner;
/**
 *
 * @author JZSUPERME
 */
public class NumberOfZero_StevenJin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N= input.nextInt();
        System.out.println(number(N));
    }
    
    public static int number(int N){
        if (N==0)
            return N;
        else
            {if (N%10==0)       
                return number(N/10)+1;
            else
                return number(N/10)+0;
            }
    }
}
