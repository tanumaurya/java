import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("give ur String: ");
        String s= scn.next();
        int ans = findTheLongestBalancedSubstring(s);
        System.out.println(ans);
    }
    public static int findTheLongestBalancedSubstring(String s) {
        int ans =0;
        for(int i=0; i<s.length(); ){
            int count=0;
            
            if(s.charAt(i)=='0'){
                count ++;
                i++;
            }else i++;
            while( i<s.length() && s.charAt(i)=='0' ){
                count++;
                i++;
            }
            int count1=0;
            if(count !=0){
                while( i<s.length() && s.charAt(i)=='1'){
                    count1++;
                    i++;
                }
            }

            int ans1=-1;
            if(count <=count1) ans1= 2*count;
            else ans1= 2*count1;

            ans = Math.max(ans, ans1); 

        }
        return ans;
    }
}
