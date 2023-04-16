import java.util.*;
import java.lang.*;
  
class Main
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
  
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 5)
            {
                System.out.println("exit...");
  
                // Terminate JVM
                System.exit(0);
            }
            else
                System.out.println("arr["+i+"] = " +
                                  arr[i]);
        }
        System.out.println("End of Program");
    }
}













// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         System.out.println("The value of N is: ");
//         int n = scn.nextInt();
//         int count =0;
//         System.out.println("The divisers are: " );

//         for(int i=1; i<=n/2 ; i++ ){
//             if(n%i==0) {
//                 count++ ;
//                 System.out.println(i);
//             }
//         }
//         System.out.println(n);
//         count++;
//         System.out.println("The no of divisers are: " + count);

//     }
// }