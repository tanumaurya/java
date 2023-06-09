import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        int sum1 =0;
        int sum2 =0;

        for(int i =0; i<N; i++){
            arr1[i]= scn.nextInt();
            sum1 += arr1[i];
        }
        for(int i =0; i<N; i++){
            arr2[i]= scn.nextInt();
            sum2 += arr2[i];
        }
        
        
        if( sum1 > sum2){
            System.out.println(0);
        }else{
            int diff = sum2 - sum1;
            int t = diff / 100;
            System.out.println(t+1);

        }


    }
}