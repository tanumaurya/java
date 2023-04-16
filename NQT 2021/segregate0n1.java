import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr= new int[n];
        int count =0;
        for(int i=0; i<n;i++){
            arr[i]=scn.nextInt();
            if(arr[i]==0) count++;
        }
        for(int j=0;j<n ; j++){
            if(count <= j) arr[j]=1;
            else arr[j]=0;
            System.out.print(arr[j] +" ");
        }
    }
}