import java.util.Scanner ;
public class power{
    public static int pwd(int num , int pow){
         if(pow == 0)return 1 ;
         return num * pwd(num , pow-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("number = ");
        int num = sc.nextInt();
        System.out.print("power = ");
        int pow = sc.nextInt();
        System.out.println(pwd(num , pow));
    }
}