package additup_stevenjin;
import java.util.Scanner;

/**
 *
 * @author JZSUPERME
 */
public class AddItUp_StevenJin {
    public static int addUp(int n){
        
        if (n>0)
            return n+addUp(n-1);
        else
            return n;
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the ginal positive integer: ");
        int n= input.nextInt();
        System.out.println("The final result is: "+ addUp(n));
    }
    
}
