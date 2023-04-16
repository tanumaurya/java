
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static int MinOperation(int[] A){

        int n=A.length;
        HashMap<Integer,Integer> map =new HashMap<Integer, Integer>();
        int max =0;
        for(int i=0; i <n; i++){
            int freq= map.getOrDefault(A[i],0)+1;
            map.put(A[i],freq);
            max=Math.max(max,freq);
        }
        int operations =n-max;
        return operations;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] A= new int[n];
        for(int i=0; i<n; i++){
            A[i]=scn.nextInt();
        }
        int answer = MinOperation(A);
        System.out.println(answer);
	}
}
