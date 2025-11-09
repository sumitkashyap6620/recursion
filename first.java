import java.util.Scanner;
public class first{
    
    public static void reverse(int l){
        if(l==0)return;
        System.out.print(l +" ");
        reverse(l-1);
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        reverse(l);
    }
}