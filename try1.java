import java.util.*;
// import java.util.Scanner;
class Main
{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            // int arr[i] = sc.nextInt();
            boolean temp = true;
            for(int j=0; j<i; j++){
                if(arr[j] > arr[i]){
                    temp = false;
                }
            }
            if(temp) count++;
        }
        System.out.println(count);
    }
    
}
