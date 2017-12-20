package codingbat;

/**author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/12/20
 * Brief instruction: This program is the collection of the logic 2.
 */

public class logic2 {
public static boolean makeBricks(int small, int big, int goal) {
  if(small+5*big<goal)
  return false;
  else
    {if(small<goal%5)
    return false; 
    return true;
    }
}
public static int loneSum(int a, int b, int c) {
  if(a==b&&b==c)
  return 0;
  else{
  if(a==b)
  return c;
  else if(b==c)
  return a;
  else if(c==a)
  return b;
  return a+b+c;}
}
public static int luckySum(int a, int b, int c) {
  if(a==13)
  return 0;
  else if (b==13)
  return a;
  else if (c==13)
  return a+b;
  return a+b+c;
}

}
