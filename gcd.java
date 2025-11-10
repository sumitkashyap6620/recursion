import java.util.*;
public class gcd{
    public static int GCD(int x ,int y ){
        if(x%y==0)return y ;
       return  GCD(y,x%y);
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