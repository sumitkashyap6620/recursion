import java.util.Scanner;
public class kmultiples{
    public static void km(int num , int k){
      if(k==1){
        System.out.print(num +" ");
        return ;
      }
      km(num,k-1);
      System.out.print(num*k +" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("number = ");
         int num = sc.nextInt();
          System.out.print("k = ");
          int k = sc.nextInt();
        km(num,k) ;
    }
}