package shape_stevenjin;
import java.util.*;
/**@author Steven Jin
 *Instructor: Daniel Gunn
 *2017-12-12
 * This is the main method of the shapes program.
 */
public class Runner_StevenJin {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //System.out.print("Please enter your radius of the circle:");
    //Double r= input.nextDouble();
    Random rng= new Random();
    Double r= rng.nextDouble();
    Circle_StevenJin c= new Circle_StevenJin(r);
    System.out.println("The radius of the circle is: "+r);
    System.out.println("The circumference of the circle is: "+c.getCircum());
    System.out.println("The area of the circle is: "+c.getArea());
    
    System.out.print("Please enter your length of the rectangle:");
    Double l= input.nextDouble();
    System.out.print("Please enter your width of the rectangle:");
    Double w= input.nextDouble();
    Rectangle_StevenJin s= new Rectangle_StevenJin(l,w);
    System.out.println("The circumference of the circle is: "+s.getPeri());
    System.out.println("The area of the circle is: "+s.getArea());
    }
    
}
