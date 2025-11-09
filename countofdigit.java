import java.util.Scanner ;
public class countofdigit{
    public static int count(int num ){
       if(num == 0 )return 0 ;
       return count(num/10)+1 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number = ");
        int num = sc.nextInt();
        System.out.print(count(num));
    }
}