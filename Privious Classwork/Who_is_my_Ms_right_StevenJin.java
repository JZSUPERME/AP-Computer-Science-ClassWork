package who_is._my_ms._right_stevenjin;

import java.util.Scanner;

/**@author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/09/22
 * Brief instruction: This program is a series of question to find if it is Ms.right.
 */
public class Who_is_my_Ms_right_StevenJin {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hello, this is the test for whether you can become Steven Jin's wife");
    System.out.print("Please enter your name: ");
    String name=input.nextLine();
    System.out.println("\n" + name + " please answer the following questions");
    System.out.print("\nPlease enter your gender: (Male, Female, other)");
    String gender=input.nextLine();
    
    if (gender.compareToIgnoreCase("Female")==0)
    {System.out.print("\nPlease enter your sexual orientation: (Male, Female, other)");
         String sexualorientation=input.nextLine();
         
         if (sexualorientation.compareToIgnoreCase("Male")==0)
            {System.out.print("\nPlease enter your height in cm: ");
             double height=input.nextDouble();
             
             if(height>=158.0 && height<=170.0)
                 {System.out.print("\nPlease enter your weight in kg: ");
                  double weight=input.nextDouble();
                    
                  if(weight>=40.0 && weight<=50.0)
                  {System.out.print("\nPlease enter your IQ: "); 
                   double IQ=input.nextDouble();
                         
                        if (IQ<=200 && IQ>=100)
                        {System.out.print("\nDo you have ex-husband?(yes, no) ");
                         Scanner in=new Scanner(System.in);
                         String Exhusband=in.nextLine();
                         
                             if (Exhusband.compareToIgnoreCase("no")==0)  
                             {System.out.print("\nPlease enter the number of ex-boyfriend: ");
                              double exboyfriend=in.nextDouble();
                                    
                                     if (exboyfriend<=3 && exboyfriend>=0)
                                     {System.out.print("\nDo you love Steven Jin?(yes, no) ");
                                      Scanner inn=new Scanner(System.in);
                                      String love=inn.nextLine();
                                         
                                         if (love.compareToIgnoreCase("yes")==0)  
                                         {System.out.print("\nWOW!!!! Congratulation!!! You can be Steven's wife!!");
                                         }else{
                                          System.out.print("\nWhat!! You do not love Steven!!! Impossible!!");   
                                         }
                                     
                                     }else{
                                      System.out.print("\nYou have too many ex-BF, noway!!!");
                                     }
                             }else{
                              System.out.print("\nSteven never get married with those who got marraied before!!!"); 
                             }    
                                     
                        }else{
                         System.out.print("\nYour IQ is out of range!!"); 
                        }
                            
                   }else{
                    System.out.print("\nYour weight is out of range!!"); 
                  }
            
              }else{
               System.out.print("\nYour weight is out of range!!"); 
              }
      
        }else{
         System.out.print("\nGo find a woman please"); 
        }
         
    }else{
     System.out.print("\nGo find a woman please");      
         }
    }
}

    

