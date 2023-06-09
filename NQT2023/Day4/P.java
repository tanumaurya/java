import java.util.*;
class Main
{ 
    public static void Main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s= scn.nextLine();
        int ans = addMinChar(s);
        System.out.println(ans);
    }
	public static int addMinChar(String str){
		//code here
		int left=0, right =str.length()-1;
		int count =0;
		while(left <= right){
		    if(str.charAt(left)==str.charAt(right)){
		        left++;
		        right--;
		    }else{
		        count++;
		        right--;
		    }
		}
		return count;
	}
}