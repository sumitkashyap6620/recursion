import java.util.Scanner ;
public class lastIdx{
    public static int LI(int arr[] , int x , int idx ){
        if(idx == -1)
            return  idx ;
          if(arr[idx]==x){
            return idx ;
          }  
        return LI(arr , x , idx-1);
        
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("lenggth :- ");
        int arr [] = new int[sc.nextInt()];
        System.out.print("array elements :- ");
        for(int i = 0 ; i < arr.length ; i++)
        arr[i] = sc.nextInt();
        System.out.print("searching elements :- ");
        int x = sc.nextInt();
      System.out.println("last index :- "+ LI(arr,x,arr.length-1));
    }
}