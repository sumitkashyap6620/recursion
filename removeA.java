import java.util.Scanner ;
public class removeA{
    public static String remove(String s , int idx , char x){
     if (idx == s.length())return "";
     String sa = remove(s, idx+1, x) ;
     if(s.charAt(idx) != x )return s.charAt(idx) + sa ;
     else return sa ;
     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give string :- ");
        String s = sc.nextLine();
         System.out.print("give char to remove :- ");
         char x = sc.next().charAt(0) ;
        System.out.print(remove(s, 0, x));
    }
}