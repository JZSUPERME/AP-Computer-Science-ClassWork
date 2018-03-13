package shape_stevenjin;
import java.util.*;
/**@author Steven Jin
 *Instructor: Daniel Gunn
 *2018-3-13
 * This is the main method of the shapes program.
 */
public abstract class Shape_StevenJin {

    private String name;
    public Shape_StevenJin(String shapeName) 
    {
        name = shapeName; 
    }
    
    public String getName() 
    { 
        return name; 
    }
    
    public abstract double area(); 
    public abstract double perimeter();
   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter the radius of the circle:");
    Double r = input.nextDouble();
    Shape_StevenJin c= new Circle_StevenJin(r,"Steven's circle");
    System.out.println("The radius of the circle is: "+r);
    System.out.println("The circumference of the circle is: "+c.perimeter());
    System.out.println("The area of the circle is: "+c.area());
    System.out.println(" ");
    
    System.out.print("Please enter the length of the rectangle:");
    Double l= input.nextDouble();
    System.out.print("Please enter the width of the rectangle:");
    Double w= input.nextDouble();
    Shape_StevenJin s= new Rectangle_StevenJin(l,w,"Steven's rectangle");
    System.out.println("The circumference of the rectangle is: "+s.perimeter());
    System.out.println("The area of the rectangle is: "+s.area());
    System.out.println(" ");
    
    System.out.print("Please enter the 1st side length of the triangle: ");
    Double a = input.nextDouble();
    System.out.print("Please enter the 2st side length of the triangle: ");
    Double b = input.nextDouble();
    System.out.print("Please enter the 3st side length of the triangle: ");
    Double d = input.nextDouble();
    Shape_StevenJin k= new Triangle_StevenJin(a,b,d,"Steven's triangle");
    System.out.println("The circumference of the triangle is: "+k.perimeter());
    System.out.println("The area of the triangle is: "+k.area());
    }
    
}
