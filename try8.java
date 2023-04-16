import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int R= scn.nextInt();
        int ans = PossibleWays(N,R);
        System.out.println(ans);

    }
    public static int PossibleWays(int N, int R){
        if(R==0) return 0;
        int sum=0;
        
        while(N>0){
            sum += N%10;
            N=N/10;
        }
        int repeatedSum = sum*R;
        int ans =0;
        while(repeatedSum >0){
            ans += repeatedSum % 10;
            repeatedSum /= 10;
        }
        return ans;
    }
}