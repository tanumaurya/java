import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int count =0;
        boolean flag =true;
        for(int i=1; i <= N; ){
            if(flag){
                int block =0;
                int p=i+4;
                while(i<= p && i<=N){
                    block ++;
                    i++;
                }
                if(i==(N+1)) System.out.println(block);
                System.out.println("reached" + (i-1));
                flag = false;
            }else{
                int block =4;
                while(block>= 1 && i<=N){
                    block --;
                    i++;                   
                }
                if(i==(N+1)) System.out.println(block);
                System.out.println("returned" + (i-1));
                flag= true;
            }
        }
    }
}