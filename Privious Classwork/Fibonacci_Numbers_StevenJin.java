package fibonacci_numbers_stevenjin;

import java.util.Scanner;
/**
 *
 * @author JZSUPERME
 */
public class Fibonacci_Numbers_StevenJin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of N: ");
        int N= input.nextInt();
        System.out.println(number(N));
    }
    
    public static int number(int N){
        if (N==1)
            return 0;
        else if (N==2)
            return 1;
        else
            return number(N-2)+number(N-1);
    }
}

