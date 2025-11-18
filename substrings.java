import java.util.* ;
public class substrings{
   
  //  2nd method 

    public static void sub2(String s , String ans){
          if(s.length() == 0 ){
            System.out.println(ans);
            return ;
          }

          char cur = s.charAt(0);

          sub2(s.substring(1),ans+cur);
          sub2(s.substring(1),ans);
    }

    public static ArrayList<String> sub(String s ){
    // let string is "abc"
      ArrayList<String> ans = new ArrayList<>(); 
    // Base case 
       if(s == ""){
        ans.add("");
        return ans ;
       }
    // recursion work 

       char cur = s.charAt(0);
       ArrayList<String> smallans = sub(s.substring(1)); 

    // self work 

    for(int i = 0 ; i < smallans.size() ; i++  ){
          ans.add(smallans.get(i));
          ans.add(cur + smallans.get(i));
    }
      return ans ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a string :- ");
        String s = sc.nextLine();
        ArrayList<String> ans = sub(s) ;
        // for(int i = 0 ; i < ans.size() ; i++){
        //   System.out.println(ans.get(i));
        // }
        System.out.println(ans);
        sub2(s,"");
    }
}