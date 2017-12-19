package computerscienceclass.pkg2;

import java.util.Scanner;

/**
 *
 * @author JZSUPERME
 */
public class MonthlyPaymentClasswork_StevenJin {

    /**
     * @Steven Jin - Class AP S3C7
     * Instructor: Daniel Gunn
     * Date:2017/09/14
     * Brief instruction: This is a monthly Payment calculator with three variables LoanAmount, MoutlyInterstRate, and years
     */
    
    
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter LoanAmount: ");
    double LoanAmount = input.nextDouble();
    System.out.print("Enter MoutlyInterstRate: ");
    double MoutlyInterstRate = input.nextDouble();
    System.out.print("Enter Years: ");
    double Years = input.nextDouble();
    
    double MonthlyPayment=LoanAmount*MoutlyInterstRate/(1-1/Math.pow((1+MoutlyInterstRate), Years*12)); 
    double TotalPayment=MonthlyPayment*Years*12;
    
    System.out.println("MonthlyPayment is " + MonthlyPayment);
    System.out.println("TotalPayment is " + TotalPayment);
    }
    
}
