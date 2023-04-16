import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt(); 
        int V =scn.nextInt(); 
        int count =0;     
       
        for(int i=0; i<=N; i++){
            for(int r=0; r<=N;r++){
                if(i*r ==V) count++;
            }
        }
        if(count==0){
            System.out.println("NO POWER");
        }else{
            System.out.println(count);
        }
    } 
} 