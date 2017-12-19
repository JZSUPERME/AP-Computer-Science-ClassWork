package shape_stevenjin;

/**@author Steven Jin
 *Instructor: Daniel Gunn
 *2017-12-12
 * This is the main method of the circle shapes .
 */
public class Circle_StevenJin {
    private double radius;
    
    public Circle_StevenJin(double r){
        this.radius= r;    
    } 
    
    public double getCircum(){
    return Math.PI*this.radius*2;
    }
    
    public double getArea(){
    return Math.PI*Math.pow(this.radius,2);
    }
}
