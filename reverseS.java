
import java.util.Scanner ;
public class reverseS{
    public static String reverse(String s ){
        if(s.length()==0)return s ;
        String sa = reverse(s.substring(1)) ;
        return sa + s.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println("give String :- ");
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
      System.out.println(reverse(s));
        
    }
}