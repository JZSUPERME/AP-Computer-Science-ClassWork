package reverseanarray_stevenjin;

import java.util.Scanner;

/**
 *
 * @author JZSUPERME
 */
public class ReverseAString_StevenJin {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Enter you String: ");
    String a=input.nextLine();
    reversestring(a);
    System.out.println(reversestring(a));
    }
    public static String reversestring(String a){
        if (a.length()==1)
            return a;
        String head = a.substring(0,a.length()-1);
            return a.substring(a.length()-1)+reversestring(head);
    }
    
}
