package shape_stevenjin;

/**@author Steven Jin
 *Instructor: Daniel Gunn
 *2018-3-13
 * This is the main method of the rectangle shapes .
 */
public class Triangle_StevenJin extends Shape_StevenJin{
    private double length1;
    private double length2;
    private double length3;

    public Triangle_StevenJin(double length1,double length2,double length3, String rectangleName) 
    {
        super(rectangleName);
        this.length1 = Math.abs(length1);
        this.length2 = Math.abs(length2);
        this.length3 = Math.abs(length3);
    }
    
    public double area() {
        return 2*(this.length1+this.length2+this.length3);
    }

    public double perimeter() {
        double p=(this.length1+this.length2+this.length3)/2;
        return Math.sqrt(p*(p-this.length1)*(p-this.length2)*(p-this.length3));
    }
}
