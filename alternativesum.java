import java.util.Scanner;
public class alternativesum{
    public static int As(int n){
        if(n==1)return n;
        if(n%2 == 0)return As(n-1)-n;
        else return As(n-1)+ n ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("length n =");
        int n = sc.nextInt();
        System.out.print(As(n));
    }
}