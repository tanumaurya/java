import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("The value of N:");
        int N= scn.nextInt();
        System.out.println("The ele of Array:");

        int[] a = new int[N];
        for(int i=0; i<a.length; i++){
            a[i] =scn.nextInt();
        }
        System.out.println("The value of D:");

        int D= scn.nextInt();
        System.out.println("The value of x:");

        int x= scn.nextInt();
        boolean flag = false;
        if(D % 2 ==0) flag=true;
        int count=0;
        if(flag){
            
            for(int i=0; i< N; i++){
                if(a[i] %2 !=0)count++;
            }
        }else{
            for(int i=0; i< N; i++){
                if(a[i]%2 ==0)count++;
            }
        }
        System.out.println("Ans is : "+ x*count);




    }
}