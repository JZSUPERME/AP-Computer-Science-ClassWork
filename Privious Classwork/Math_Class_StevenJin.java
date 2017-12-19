package math_class_java;
import java.util.Scanner;
/**
 *@author:Steven Jin - Class AP S3C7
 * Instructor: Daniel Gunn
 * Date:2017/09/21
 * Brief instruction: This program is a mathematics calculator.
 */
public class Math_Class_StevenJin {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Q1: x^2+5x-7 = ?");
    System.out.print("Q1: Enter the value of x: ");
    double x1 = input.nextDouble();
    double Answer1 = Math.pow(x1,2) + 5 * x1 -7;
    System.out.println("Q1: x^2+5x-7= " + Answer1);
    System.out.println(" ");//leave a blank line
    
    System.out.println("Q2: 10x^3+5x^2-x+100 = ?");
    System.out.print("Q2: Enter the value of x: ");
    double x2 = input.nextDouble();
    double Answer2 = 10 * Math.pow(x2,3) + 5 * Math.pow(x2,2) - x2 + 100;
    System.out.println("Q2: 10x^3+5x^2-x+100= " + Answer2);
    System.out.println(" ");//leave a blank line
    
    System.out.println("Q3: x^(1/5)+2x^(1/2) = ?");
    System.out.print("Q3: Enter the value of x: ");
    double x3 = input.nextDouble();
    double Answer3 = Math.pow(x3,0.2) + 2 * (Math.sqrt(x3));
    System.out.println("Q3: x^(1/5)+2x^(1/2)= " + Answer3);
    System.out.println(" ");//leave a blank line
    
    System.out.println("Q4: Calculate the value between 2 point");
    System.out.print("Q4: Enter the value of X1: ");
    double x4 = input.nextDouble();
    System.out.print("Enter the value of Y1: ");
    double y1 = input.nextDouble();
    System.out.print("Enter the value of X2: ");
    double x5 = input.nextDouble();
    System.out.print("Enter the value of Y2: ");
    double y2 = input.nextDouble();
    double Answer4 = Math.sqrt(Math.pow((x4-x5),2) + Math.pow((y1-y2),2));
    System.out.println("Q4: The distance between (X1,y1) & (X2,Y2)= " + Answer4);
    System.out.println(" ");//leave a blank line
    
    System.out.println("Q5: Calcuate the hypotenuse of the right trangle");
    System.out.print("Q5: Enter the value of one side: ");
    double x6 = input.nextDouble();
    System.out.print("Enter the value of the other side: ");
    double y3 = input.nextDouble();
    double Answer5 = Math.sqrt(Math.pow((x6),2) + Math.pow((y3),2));
    System.out.println("Q5: The hypotenuse of the right triangle = " + Answer5);
    System.out.println(" ");//leave a blank line
    
    System.out.println("Q6: (x^2+y^2)/(7x) = ?");
    System.out.print("Q6: Enter the value of x: ");
    double x7 = input.nextDouble();
    System.out.print("Enter the value of y: ");
    double y4 = input.nextDouble();
    double Answer6 = (Math.pow(x7,2) + Math.pow(y4,2))/(7 * x7);
    System.out.println("Q6: (x^2+y^2)/(7x) = " + Answer6);
    System.out.println(" ");//leave a blank line
    
    System.out.println("Q7: √((x^2+3x^3)/(2xy)) = ?" );
    System.out.print("Q7: Enter the value of x: ");
    double x8 = input.nextDouble();
    System.out.print("Enter the value of y: ");
    double y5 = input.nextDouble();
    double Answer7 = Math.sqrt((Math.pow(x8,2) + 3 * Math.pow(x8,3))/(2 * x8 * y5));
    System.out.println("Q7: √((x^2+3x^3)/(2xy)) = " + Answer7);
    System.out.println(" ");//leave a blank line
    
    System.out.println("Q8: 2x+√(X/2) = ?");
    System.out.print("Q8: Enter the value of x: ");
    double x9 = input.nextDouble();
    double Answer8 = 2 * x9 + Math.sqrt(x9/2);
    System.out.println("Q8: 2x+√(X/2) = " + Answer8);
    System.out.println(" ");//leave a blank line
    
    }
    
}
