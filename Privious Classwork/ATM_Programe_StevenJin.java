package atm_programe_stevenjin;

import java.util.Scanner;

/**@author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/09/22
 * Brief instruction: This program is a mimic ATM program.
 * Version 1: if
 * Version 2: case
 * Version 3: while loop
 * Version 4: do while loop
 */

public class ATM_Programe_StevenJin {
    
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome! Enter the number for your transaction:");
    System.out.println("\nWithdraw cash: \t\t 1\nMake a deposit: \t 2\nCheck you balance: \t 3\nExit: \t\t\t 4");
    System.out.print("\nPlase enter your choice(1,2,3,4): ");
    
    int Yourchoice= input.nextInt();
    
    double Money = 2500.25;
    
    
    
    do{
    switch(Yourchoice){ 
        case 1:
        System.out.print("\nPlease enter the number you want to withdraw:");
        double withdraw = input.nextDouble();
           if (withdraw<=Money)
           Money-=withdraw;
           else
           System.out.println("\n Your account do not have enough money");
        System.out.println("\nYour new account is : " + Money);
        break;
        
        case 2:
        System.out.print("\nPlease enter the number you want to make deposit:");
        double deposit = input.nextDouble();
        Money+=deposit;
        System.out.println("\nYour new account is : " + Money);
        break;
        
        case 3:
        System.out.println("\nYour account is : " + Money); 
        break;
    
        case 4:
        System.out.println("\nDo you really want to exit?");
        break;
        
        default:
        System.out.println("Input Error, please re-input your choice");
        
        System.out.print("\nPlase enter your choice(1,2,3,4): ");
    
        Yourchoice= input.nextInt();
    }
    System.out.print("\nPlease, enter your choice(1,2,3,4): ");
    
        Yourchoice= input.nextInt();
    }
     while (Yourchoice!=4);
     System.out.println("\nThanks for you operation");
    
    }
}


