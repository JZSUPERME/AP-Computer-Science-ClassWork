/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circumference.classwork;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author JZSUPERME
 */
public class CircumferenceClasswork_StevenJin {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    //User input raius of the circle
    System.out.print("Enter radius: ");
   
    double radius = input.nextDouble(); 
    double circumference = 2 * Math.PI * radius;
    double area = Math.PI * Math.pow(radius,2);
    
    System.out.println("Circumference is " + circumference);
    System.out.println("Area is " + area);
    }
    

}
