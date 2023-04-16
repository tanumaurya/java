import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int L =scn.nextInt();
        int ans = countAqua(str, L);
        System.out.println(ans);
    }
    public static int countAqua(String str, int L) {
        int n = str.length();
        int maxAqua = 0;
        for (int i = 0; i < n; i += L) {
            String sub = str.substring(i, Math.min(i + L, n));
            int countAqua = 0;
            for (int j = 0; j < sub.length(); j++) {
                if (sub.charAt(j) == 'a') {
                    countAqua++;
                }
            }
            if (countAqua > maxAqua) {
                maxAqua = countAqua;
            }
        }
        return maxAqua;
    }
}
