import java.util.Scanner ;
public class palendrome{

    public static boolean  isp(String s , int l , int r){
        if(l>r )return true ;
        if(isp(s,l+1,r-1)){
           if(s.charAt(l) != s.charAt(r)) return false ;
           else return true ;
        }
         return false ;     
    }
    public static void main (String args[]){
      System.out.println("give streing :- ");
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
     System.out.println(isp(s,0,s.length()-1)); 
    }
}