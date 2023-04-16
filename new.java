import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{ 
    public static int minOpration(int[] A, int K){
         int n =A.length;
         int[] remCount = new int[K];
         for(int i=0; i< n; i++){
            remCount[A[i] % K]++;
         }
         int ans =0;
         int left=0, right =K-1;
         while(left<right){
            int diff = Math.min(remCount[left],remCount[right]);
            ans +=diff;
            remCount[left] -= diff;
            remCount[right] -= diff;
            if(remCount[left]==0){
                left++;

            }
            if(remCount[right]==0){
                right--;                
            }
         }
         if(left==right && remCount[left]>0){
            ans += 1;
         }
         return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int A[] ={5,2,9,2,7};
    
        int K=3;
        int answer = minOpration(A,K);
        System.out.println(answer);
        
	}
}