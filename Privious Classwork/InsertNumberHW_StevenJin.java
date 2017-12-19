package insertnumberhw_stevenjin;

import java.util.*;
/**author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/11/12
 * Brief instruction:This program is used to insert a number into a number sequence.
 */
public class InsertNumberHW_StevenJin {

    public static boolean insert(int[]Array, int count, int n){
    for(int i=0;i<=Array.length-1;i++)
        {while(n>Array[count])
            {count++;
                if(Array[count]==0)
                    break;} 
    for(int j=Array.length-1;j>count;j--){
        Array[j]=Array[j-1];
        Array[count]=n;
        System.out.println(Arrays.toString(Array));
        return true;
    }}
    return false;
    }
    public static void main(String[] args) {
    int Array[] = {1,2,3,4,5,7,9,10,12,24,25,0,0,0};
    System.out.print("Please enter the number you wan to insert: ");
    Scanner input= new Scanner(System.in);
    int n = input.nextInt();
    insert(Array,0,n);
    }
    
}
