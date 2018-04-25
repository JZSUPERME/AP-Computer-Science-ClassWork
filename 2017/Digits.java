package digits_stevenjin;
import java.util.*;

public class Digits{
        /** The list of digits from the number used to construct this object.
        * The digits appear in the list in the same order in which they appear in the original number. */
    private ArrayList<Integer> digitList;

    
    public Digits(int num){   
        digitList = new ArrayList<Integer>();
        digitList.add(0, new Integer(num % 10));
        int numr = num / 10;
        while(numr > 0)
        {
            digitList.add(0, new Integer(numr % 10));
            numr /= 10;
        }
    }
    
    /** Returns true if the digits in this Digits object are in strictly increasing order; * false otherwise.
    */
    public boolean isStrictlyIncreasing(){
    for(int i=0;i<digitList.size()-1;i++){
      if(digitList.get(i - 1).compareTo(digitList.get(i)) >= 0)
      return false;}

    return true;
    }
}