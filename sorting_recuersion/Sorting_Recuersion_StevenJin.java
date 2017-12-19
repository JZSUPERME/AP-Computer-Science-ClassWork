package sorting_recuersion_stevenjin;

import java.util.*;

/**
 *
 * @author JZSUPERME
 */
public class Sorting_Recuersion_StevenJin {
    public static void mergesort(int A[]){
    int []B=Arrays.copyOf(A,A.length);
    TopDownSplitMerge(B,0,A.length,A);
    }
    
    public static int[] TopDownSplitMerge(int B[],int iBegin,int iEnd,int A[]){
    if(iEnd-iBegin<2)  
        return B;
    int iMiddle=(iBegin+iEnd)/2;
    TopDownSplitMerge(A,iBegin,iMiddle,B);
    TopDownSplitMerge(A,iMiddle,iEnd,B);
    TopDownMerge(B,iBegin,iMiddle,iEnd,A);
    return B;
    }
    
    public static int[] TopDownMerge(int A[],int iBegin,int iMiddle,int iEnd,int B[]){
    int i=iBegin;
    int j=iMiddle;
    for(int k=iBegin;k<iEnd;k++){
        if(i<iMiddle&&(j>=iEnd||A[i]<=A[j]))
            {B[k]=A[i];
            i++;
        }else{
            B[k]=A[j];
            j++;
            }
        }
    return B;
    }
    public static void main(String[] args) {
        int A[]={4,2,6,1,9,5,8,10,3,7,14,13,11,12,15,19,18,20,17,16};
        int []B=Arrays.copyOf(A,A.length);
        System.out.print(Arrays.toString(TopDownSplitMerge(B,0,A.length,A)));
        
        
    }
    
}
