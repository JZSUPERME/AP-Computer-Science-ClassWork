package numberinenglishwords_stevenjin;

import java.util.Scanner;

/**
 * @author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/10/24
 * Brief instruction: This program is a print number into English Program.
 */ 

public class NumberInEnglishWords_StevenJin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N= input.nextInt();
        System.out.println(number(N));
    }
    
    public static String number(int N){
        if (N==0)
            return"";
        else{
            if (N%10==0)       
                return number(N/10)+"Zero ";
            else if (N%10==1)
                return number(N/10)+"One ";    
            else if (N%10==2)
                return number(N/10)+"Two ";
            else if (N%10==3)
                return number(N/10)+"Three ";
            else if (N%10==4)
                return number(N/10)+"Four ";
            else if (N%10==5)
                return number(N/10)+"Five ";
            else if (N%10==6)
                return number(N/10)+"Six ";
            else if (N%10==7)
                return number(N/10)+"Seven ";
            else if (N%10==8)
                return number(N/10)+"Eight ";
            else if (N%10==9)
                return number(N/10)+"Nine ";
            }
            return"";
            
    }
}

