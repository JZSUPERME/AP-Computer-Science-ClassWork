package search_stevenjin;

import java.util.*;
/**author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/10/12
 * Brief instruction:This program is a linear search program aimed on a .two dimensional sequence 
 */
public class Search_StevenJin {

    /**
     * @param Array a two dimensional array to search in
     * @param n the value to search for
     * @return the index row and column of the found item
     */
    
    public static int[] linear_search(int[][]Array, int n){
    int ans[]= new int [2];   
    for (int i=0; i<= Array.length-1;i++)
        {for (int j=0; j<= Array[i].length-1;j++)
            {if (n == Array[i][j])
                {ans[0]=i;
                ans[1]=j;
                return ans;
            }
            }
    }
    ans[0]=-1;
    ans[1]=-1;
    return ans;
    }
    
    public static void main(String[] args) {
        int Array[][]={{1,5},{2,3,22,4,7}};
        System.out.print("Enter the number you want to search: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(Arrays.toString(linear_search(Array,n)));
    }
    
}
