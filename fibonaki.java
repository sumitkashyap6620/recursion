import java.util.Scanner ;
public class fibonaki{
    public static int feb(int n){
      if(n==0 || n == 1)return n ;
    //   int n1 = feb(n-1);
    //   int n2 = feb(n-2);
      return feb(n-1)+feb(n-2) ;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n =");
    int n = sc.nextInt();
    System.out.print(feb(n));
}
}