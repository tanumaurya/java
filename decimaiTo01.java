import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String ans = "";
        while(n>0){
            int p = n% 2;
            ans += p;
            n = n/2;
            System.out.println(ans);
        }
        // int final = Integer.parseInt(ans);
        // System.out.println(final);
    }
}