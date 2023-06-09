import java.util.* ;
import java.io.*; 

class Main{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] s =new String[n];
        for(int i=0; i<= n; i++){
            s[i] = scn.nextLine();
        }
        countColumns( s);
        int ans = countColumns(s);
        System.out.println(ans+ "....");
    }
    public static int countColumns(String[] s){
        // Write your code here.
        for(int i=0; i< s.length-1; i++){
            for(int j=0; j<s[i].length()-1;j++){
                if(s[i].charAt(i)>=s[i].charAt(i+1)) return i;
            }
            // ?System.out.print(" checked " +i);
        }
        return -1;
    }
}