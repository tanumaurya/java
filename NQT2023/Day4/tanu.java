import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str= scn.nextLine();
        String ans = reverseString(str);
        System.out.println(ans);                        
    }
    public static String reverseString(String str) {
        char[] strArray = str.toCharArray();
        int left = 0;
        int right = strArray.length - 1;
        while (left < right) {
            if (Character.isDigit(strArray[left])) {
                left++;
            } else if (Character.isDigit(strArray[right])) {
                right--;
            } else {
                char temp = strArray[left];
                strArray[left] = strArray[right];
                strArray[right] = temp;
                left++;
                right--;
            }
        }
        String ans = new String(strArray);
        return ans;
    }
}
// new String(strArray);












// int N= scn.nextInt();
//         int[] arr = new int[N];
//         for(int i=0; i<N; i++){
//             arr[i]= scn.nextInt();
//         }
//         int R1= scn.nextInt();
//         int R2= scn.nextInt();
//         int count =0;
//         for(int i=0; i<N; i++){
//             if(arr[i]>= R1 && arr[j]<=R2 ) count ++;
//         }
//         System.out.println(count);5