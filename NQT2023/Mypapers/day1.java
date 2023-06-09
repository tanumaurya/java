import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1= scn.nextInt();
        int n2= scn.nextInt();
        int X= scn.nextInt();
        int time =0;
        if(n1 >= n2 ){
            System.out.println(-1);
        }else{
            int p =X;
            int q =0;
                        
            while(p >= q){
                time++;
                p += n1;
                q +=n2;

            }
            System.out.println(time);

        }
        
    }
}