Que: 

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        List<int[]> finalList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                finalList.add(new int[]{i, j});
            }
        }
        int maximum = 0;
        for (int i = 0; i < finalList.size(); i++) {
            for (int j = i + 1; j < finalList.size(); j++) {
                Set<Integer> a = new HashSet<>(range(finalList.get(i)[0], finalList.get(i)[1]));
                Set<Integer> b = new HashSet<>(range(finalList.get(j)[0], finalList.get(j)[1]));
                if (Collections.disjoint(a, b)) {
                    if (finalList.get(i)[1] < finalList.get(j)[0]) {
                        int ans = finalList.get(j)[0] - finalList.get(i)[1];
                        if (ans > k) {
                            int sumvalue = sum(Arrays.copyOfRange(A, finalList.get(i)[0] - 1, finalList.get(i)[1]))
                                          + sum(Arrays.copyOfRange(A, finalList.get(j)[0] - 1, finalList.get(j)[1]));
                            maximum = Math.max(maximum, sumvalue);
                        }
                    }
                }
            }
        }
        System.out.println(maximum);
    }
    
    private static List<Integer> range(int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            result.add(i);
        }
        return result;
    }
    
    private static int sum(int[] arr) {
        int result = 0;
        for (int value : arr) {
            result += value;
        }
        return result;
    }
}

// import java.util.*;

// class Main {
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         int k = scn.nextInt();
//         int ans = findMaxDirtySeq( k);
//         System.out.println(ans);
//     }
//     public static int findMaxDirtySeq(int K) {
//         int maxLen = 0;
//         for (int len = 3; len <= K; len++) {
//             int[] seq = new int[len];
//             seq[0] = 1;
//             seq[len-1] = K;
//             for (int i = 1; i < len-1; i++) {
//                 for (int j = 1; j <= K; j++) {
//                     seq[i] = j;
//                     boolean isDirty = true;
//                     for (int k = 1; k < len-1; k++) {
//                         if (2*seq[k] <= seq[k-1] + seq[k+1]) {
//                             isDirty = false;
//                             break;
//                         }
//                     }
//                     if (isDirty && len > maxLen) {
//                         maxLen = len;
//                     }
//                 }
//             }
//         }
//         return maxLen;
//     }
// }
