package shape_stevenjin;

/**@author Steven Jin
 *Instructor: Daniel Gunn
 *2018-3-13
 * This is the main method of the rectangle shapes .
 */

public class Rectangle_StevenJin extends Shape_StevenJin{

private double length;
private double width;

public Rectangle_StevenJin(double length,double width, String rectangleName) 
    {
        super(rectangleName);
        this.length = Math.abs(length);
        this.width= Math.abs(width);
    }

    public double area() {
        return 2*(this.length+this.width);
    }


    public double perimeter() {
        return this.length*this.width;
    }
}