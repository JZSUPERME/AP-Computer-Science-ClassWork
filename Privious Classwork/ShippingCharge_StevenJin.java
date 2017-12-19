package shippingcharge_steven.jin;

import java.util.Scanner;

/**@author Steven Jin S3C7
 *Instructor: Daniel Gunn
 * Date:2017/09/20
 * Brief instruction: This program is used to calculate total shipping price in two decimal places.
 */

public class ShippingCharge_StevenJin {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
   
    System.out.print("Enter weight of a package: ");
    double weight = input.nextDouble();
    System.out.print("Enter a shipping price: $");
    double shippingprice = input.nextDouble();
    
    double TotalPrice;
    TotalPrice = (int) ((weight * shippingprice + 0.005) * 100);
    TotalPrice = TotalPrice/100;
    
    System.out.print("Total Price: $" + TotalPrice);
    
    }
    
}
