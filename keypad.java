import java.util.Scanner ;
public class keypad{
  public static void combinations(String dig , String[] match , String res){
   if(dig == ""){
    System.out.print(res+" ");
    return ;
   }
   int currentdig = dig.charAt(0)-'0' ;
   String matc = match[currentdig];
   for(int i = 0 ; i < matc.length() ; i++){
    combinations(dig.substring(1), match, res+matc.charAt(i));
   }
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      System.out.print("Give any digit combination :- ");
      String dig = sc.next();
      String[] match = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}   ;
       combinations(dig, match, ""); 
    }
}