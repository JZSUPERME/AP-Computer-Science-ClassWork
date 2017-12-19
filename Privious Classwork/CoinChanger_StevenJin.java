
package coinchanger_stevenjin;

import java.util.Scanner;

/**author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/10/11
 * Brief instruction: This program is a coin changer, which divided money between 
 * 1 penny and 1 dollar to half-dollar, quarter, dime, nickel, penny.
 */

public class CoinChanger_StevenJin {

    public static void CoinChanger(int amount){
        
        int halfdollar = (int) amount/50;
        int remainder1 = amount%50;
        int quarter = (int) remainder1/25;
        int remainder2 = remainder1%25;
        int dime = (int) remainder2/10;
        int remainder3 = remainder2%10;
        int nickel = (int) remainder3/5;
        int remainder4 = remainder3%5;
        int penny = remainder4;
        
        System.out.println(halfdollar+" halfdollar\n"+quarter+" quarter\n"+dime+" dime\n"
                           +nickel+" nickel\n"+penny+" penny");
        
        return;
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total cents you want to divide: ");
        int amount=input.nextInt();
        CoinChanger(amount);
    }
    
}
