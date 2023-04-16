import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        int L = scn.nextInt();
        int N= str.length();
        int count1=0;
        int i;
        for(i=0; i<N; i +=L){
            int a_count=0;
            if(i+L >= N){ 
                System.out.println("I am in");
                while(i<N){
                    if(str.charAt(i)=='a'){
                        a_count++; 
                    } 
                    i++;
                }
                count1= Math.max(count1, a_count);
                System.out.println(count1);
                       
            }else{
                for(int j=i; j<L+i; j++){
                    if(str.charAt(j)=='a'){
                        a_count ++; 
                    }
                }
                count1= Math.max(count1, a_count);
            }
        }
    }
}