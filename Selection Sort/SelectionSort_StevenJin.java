package selectionSort_stevenjin;

import java.util.*;
/**@author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/11/15
 * Brief instruction:This program is a Selection sort program. The other one is 
 * a insertion sort program.
 */
 
public class SelectionSort_StevenJin {
    
    public static int[] Sort(int Array[]){
        for(int i=0;i<=Array.length-1;i++){
            int min=Array[i];
            int count=i;
            for(int j=i+1;j<=Array.length-1;j++){
                if(Array[j]<min)
                {min=Array[j];
                 count=j;
                }
                }
            Array[count]=Array[i];
            Array[i]=min; 
            }
        return Array;    
        }
    
    public static int[] Sort1(int Array[]){
        int temp=0;
        for(int i=0;i<=Array.length-2;i++){
            int j=i+1;
            while(Array[j]<Array[i])
                {
                temp=Array[j];
                Array[j]=Array[i];
                Array[i]=temp;
                j--;
                i--;
                if(i<=0)
                    break;
            }      
        }
        return Array;
        }
    
    public static int[] mergesort(int Array[]){
        // base case
        if (Array.length<2)
            return Array;
        int[]head=new int[Array.length/2];
        int[]tail=new int[(Array.length+1)/2];
        
        int headindex=0;
        int tailindex=0;
        
        for (int i=0;i<Array.length;i++)
            if(i<(Array.length/2))   
                head[headindex++]=Array[i];
            else
                tail[tailindex++]=Array[i];
        
        //merge
        headindex=0;
        tailindex=0;
        for (int i=0;i<Array.length;i++){
            if(headindex==head.length)
                Array[i]=tail[tailindex++];
            else if (tailindex==tail.length)
                Array[i]=head[headindex++];
            else if (head[tailindex]<tail[tailindex])
                Array[i]=head[headindex++];
            else
                Array[i]=tail[tailindex++];
        }
        return Array;
        }
   
    
    
    
    public static void main(String[] args) {
        int Array[]={4,2,6,1,9,5,8,10,3,7,14,13,11,12,15,19,18,20,17,16};
        System.out.println(Arrays.toString(Sort(Array)));
        System.out.println(Arrays.toString(Sort1(Array)));
        System.out.println(Arrays.toString(mergesort(Array)));
        
    }
    
}
