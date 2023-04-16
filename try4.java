import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // read number of colors
        String[] balloons = new String[n];
        String[] balloons1 = new String[n];

        for (int i = 0; i < n; i++) {
            balloons[i] = sc.next(); // read balloon colors
            balloons1[i]=balloons[i].toLowerCase();
            // System.out.println(balloons1[i]);

        }
        int oddBalloonColor = findOddBalloonColor(balloons1);
        if(oddBalloonColor ==-1){
            System.out.println("All are even");
        }else{
            System.out.println(balloons[oddBalloonColor]);

        }
        
    }

    private static int findOddBalloonColor(String[] balloons) {
        HashMap<String, Integer> colorCount = new HashMap<>();
        for (String balloon : balloons) {
            int count = colorCount.getOrDefault(balloon, 0);
            colorCount.put(balloon, count + 1);
        }
        for(int i=0; i< balloons.length; i++){
            int count = colorCount.get(balloons[i]);
            if (count % 2 != 0) {
                return i;
            }
        }
        
        return -1;
    }
}
