import java.util.Scanner ;
public class reverseN{
    public static int rev(int x, int sum){
        if(x==0)return sum;
        int c = x%10 ;
        sum = sum*10 + c ;
        return rev(x/10 , sum ) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give a number :- ");
        int x = sc.nextInt();
        System.out.println(rev(x,0));
    }
}
