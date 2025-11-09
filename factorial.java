import java.util.Scanner;
public class factorial {
    public static int fact(int n ){
        // base case :::
         if(n==1)return 1 ;
        // subproblem :::
         int temp = fact(n-1);
        // selfwork :::
          return temp * n ;
    }
    public static void main (String args[]){
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fact(n));
    }
}