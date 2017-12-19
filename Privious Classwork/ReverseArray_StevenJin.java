package reversearray_stevenjin;

import java.util.Scanner;

/**
 * @author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/10/18
 * Brief instruction: This program is a reverse array program.
 */

public class ReverseArray_StevenJin {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int Array[]=new int[10];
       int i;
       for(i=0;i<Array.length;i++)
       {System.out.print("enter your "+(i+1)+" number into your array: ");
           Array[i]=input.nextInt();
       }
       System.out.println("");
       for(i=Array.length-1;i>=0;i--)
       {System.out.print(Array[i]+" ");
       }  
    }
    
}
