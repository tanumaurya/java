import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("A is :");

        String A = scn.nextLine();
        System.out.println("B is :");

        String B = scn.nextLine();
        String ans = "";
        for(int i=0; i< A.length();i++){
            char ch= A.charAt(i);
            boolean bool = true;
            for(int j=0; j< B.length(); j++){
                if(ch == B.charAt(j)) bool =false;

            }
            if(bool) ans += ch;
        }
        System.out.println("Answer is : "+ ans);
    }
}