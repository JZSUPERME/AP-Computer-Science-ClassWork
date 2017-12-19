package mergesortalgorithm_stevenjin;

import java.util.Scanner;

/**author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/10/12
 * Brief instruction:This program is a binary search program aimed on a one dimensional sequence 
 */

public class MergeSortAlgorithm_StevenJin {
    
    public static void printArray(int array[]){
    
        for(int i=0;i<=array.length;i++)
            System.out.print(array[i]+" ");}
    
    public static int[] mergesort(int array[]){
        // base case
        if (array.length<2)
            return array;
        int[]head=new int[array.length/2];
        int[]tail=new int[(array.length+1)/2];
        
        int headindex=0;
        int tailindex=0;
        
        for (int i=0;i<array.length;i++)
            if(i<(array.length/2))   
                head[headindex++]=array[i];
            else
                tail[tailindex++]=array[i];
        
        //recursive sort both splits
        printArray(head);
        printArray(tail);
        
        //merge
        headindex=0;
        tailindex=0;
        for (int i=0;i<array.length;i++){
            if(headindex==head.length)
                array[i]=tail[tailindex++];
            else if (tailindex==tail.length)
                array[i]=head[headindex++];
            else if (head[tailindex]<tail[tailindex])
                array[i]=head[headindex++];
            else
                array[i]=tail[tailindex++];
        }
        return array;
        }
                       
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the total number you want to resort(even): ");
        int i=input.nextInt();
        int array[]= new int [i];
        for(int k=0;k<i;k++)
            {System.out.print("enter your "+(k+1)+" number into your array: ");
                array[k]=input.nextInt();
            }
            printArray(array);
            mergesort(array);
            System.out.print("Result: ");
    }
    
}
