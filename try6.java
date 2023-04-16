import java.util.*;
class Main {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N =scn.nextInt();
        int M =scn.nextInt();
        int X =scn.nextInt();
        int ArrTime=0, Duration = 0, waitingTime=0;
        for(int i=1; i<=N; i++){
           ArrTime = 3*i;
           Duration = M*i;
           waitingTime= Duration - ArrTime;
        }
        System.out.println(waitingTime);
    }
}
// import java.util.*;
// class Main
// {
//     public static void main(String[] args)
//     {
//     Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int x=sc.nextInt();
//         int lastArrival=m*(n-1);
//         int lastDuration=x*(n-1);
//         System.out.println(lastDuration-lastArrival);
//     }
// }
