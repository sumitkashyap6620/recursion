import java.util.Scanner ;
public class removeA{
    public static String remove(String s , char x){
     if (s=="")return s;
     String sa = remove(s.substring(1), x) ;
     if(s.charAt(0) != x )return s.charAt(0) + sa ;
     else return sa ;
     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give string :- ");
        String s = sc.nextLine();
         System.out.print("give char to remove :- ");
         char x = sc.next().charAt(0) ;
        System.out.print(remove(s, x));
    }
}