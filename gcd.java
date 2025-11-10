import java.util.*;
public class gcd{
    public static int GCD(int x ,int y ){
           int k =  Math.min(x,y);
           int p = Math.max(x,y);
           while(p%k != 0){
             x = k ;
             k = p % k ;
             p = x ;
           }
           return k ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number 1 = ");
        int x = sc.nextInt();
        System.out.print("number 2 = ");
        int y = sc.nextInt();
        System.out.println(GCD(x,y));
    }
}