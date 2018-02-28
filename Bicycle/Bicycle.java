package bicycle;
import java.util.*;
/**
 *
 * @author JZSUPERME
 */
public class Bicycle {
    private double radius;
    private double revpermin;
    private double time; //time in minutes
    private double caloriespermeter;
    private String brand;
    private String type;
    private String model;
    private String transmission;
    private double length;
    private String material;
    
    public double Distance(double t,double speed){
      double distance=0.0;
      time=t;
      radius=this.radius;
      revpermin=speed;
      distance= time * radius * revpermin;
      return distance;
    }
    
    public double Calories(double t, double speed, double c){
      double calories=0.0;
      time=t;
      radius=this.radius;
      revpermin=speed;
      caloriespermeter=c;
      calories= 1.6789236 * time * radius * revpermin * caloriespermeter;
      return calories;
    }
    
    public Bicycle(){
      radius=0;
      brand="Giant";
      type="Mountain type";
      model="N-ac722";
      transmission="3 in left hand side, 6 in right hand side";
      length=79.83;
      material= "Titanium Alloy";
    }
    
    public Bicycle(int n, String b, String t,String m, String t1, double l, String m1){
      radius=n;
      brand=b;
      type=t;
      model=m;
      transmission=t1;
      length=l;
      material=m1;
    }
    
}
