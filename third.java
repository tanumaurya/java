import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int[] A = {6,4,10};
        int n = A.length;
        int count =0;
        checker(A, 0, n);
        public static int checker(int[] A, sidx, n){
            int sum =0;
            int sum1 =0;
            if(sidx==n){
                if(sum %2 ==0)return count+1;
                else return count;
            }
            for(int i=sidx; i <n ; i++){
               sum += A[i];
            } 
            for(int i=sidx; i <n ; i++){
               sum1 += A[i]/2;
            }         
            if(sum % 2==0 && sum1 % 2==0){
                count ++;
                checker(A, sidx+1,n);
            }else {
                return count;
            }
        }
        
        
	}
}