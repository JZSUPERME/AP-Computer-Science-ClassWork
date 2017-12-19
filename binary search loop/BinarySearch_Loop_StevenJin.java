package binarysearch_loop_stevenjin;

import java.util.*;
/**author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/10/12
 * Brief instruction:This program is a binary search program aimed on a one dimensional sequence 
 */

public class BinarySearch_Loop_StevenJin {

    /**
     * @param Array a two dimensional array to search in
     * @param n the value to search for
     * @return the index row and column of the found item
     */
    
    public static int linear_search(int[]Array, int n){
        int lower=0;
        int upper=Array.length-1;
        int mid=(int)(lower+upper)/2;
        while(n!=Array[mid])
            {if (n>Array[mid])
                {lower=mid+1;
                mid=(int)(lower+upper)/2;}
             else
                {upper=mid-1;
                mid=(int)(lower+upper)/2;}
             if(upper==mid||lower==mid)
                 break;
            }
        if(Array[mid]==n)
            return mid;
        else 
            mid = -1;
            return mid;
    }
    
    public static void main(String[] args) {
        int Array[]={1, 2, 4, 6 , 7 , 23, 24, 25, 27, 32, 39, 43, 47, 49, 61};
        System.out.print("Enter the number you want to search: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(linear_search(Array,n));
    }
    
}
    

