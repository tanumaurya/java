import java.util.*;
import java.util.Scanner;
class main{
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int sum=0;
        int n=str.length();
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                 String s= str.substring(i,j+1);
                 sum += Integer.parseInt(s);
            }
        }
        System.out.println(sum);

    }

}