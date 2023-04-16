import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{   
    public static void permutations(int[] arr, int start, int end){
        if(start==end) return;
        else{
            for(int i=start; i<=end; i++){
                swap(arr, start, i);
                permutations(arr, start+1,end);
                swap(arr,start,i);
            }
        }

    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    public static int countGoodPrefix(int[] A){
        Arrays.sort(A);
        int count =0;
        int prefixSum =0;
        for(int i=A.length-1;i>=0;i--){
            if(A[i]%2==1){
                prefixSum +=A[i];
            }
            if(prefixSum % 2==1){
                count++;
            }
        }
        return count;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int[] A ={4,3,6};
        int count = countGoodPrefix(A);
        System.out.println(count);
	}
}