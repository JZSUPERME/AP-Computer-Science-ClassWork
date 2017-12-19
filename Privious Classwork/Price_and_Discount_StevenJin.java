package price_and_discount_stevenjin;

import java.util.Scanner;

/**author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/10/12
 * Brief instruction:This program is used to calculate the price after discount.
 */
public class Price_and_Discount_StevenJin {

    public static void main(String[] args) {
        
        double cost=cost(126,12);
        System.out.println("Your need to pay: " + cost);
    }
    
    public static double cost(double price,double discount)
    {
    double Totalprice = price * discount;
    return Totalprice;
    }
    
    public static double cost(double price,int discount)
    {
    double Totalprice = price * discount/100;
    return Totalprice;
    }
}