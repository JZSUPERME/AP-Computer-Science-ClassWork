package shape_stevenjin;

/**@author Steven Jin
 *Instructor: Daniel Gunn
 *2018-3-13
 * This is the main method of the circle shapes .
 */
public class Circle_StevenJin extends Shape_StevenJin
{
    private double radius;
    
     public Circle_StevenJin(double radius, String circleName) 
    {
        super(circleName);
        this.radius = Math.abs(radius); 
    }

    public double area() {
        return Math.PI*Math.pow(this.radius,2); 
    }
    
    public double perimeter() {
        return Math.PI*this.radius*2; 
    }
}
