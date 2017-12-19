package shape_stevenjin;

/**@author Steven Jin
 *Instructor: Daniel Gunn
 *2017-12-12
 * This is the main method of the rectangle shapes .
 */

public class Rectangle_StevenJin {
private double length;
private double width;

public Rectangle_StevenJin(double l,double w){
        this.length=l;   
        this.width=w;
    } 
    
    public double getPeri(){
    return 2*(this.length+this.width);
    }
    
    public double getArea(){
    return this.length*this.width;
    }
}