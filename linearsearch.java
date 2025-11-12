import java.util.Scanner ;
public class linearsearch{
    public static void Ls(int arr[] , int x , int idx ){
        if(idx == -1)
            return  ;
            Ls(arr,x,idx-1);
          if(arr[idx] == x )
         System.out.print(idx+" ");
        
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
       Ls(arr,x,arr.length-1);
    }
}