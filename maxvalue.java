import java.util.*;
public class maxvalue{
    public static int mx(int[] arr ,int idx){
        if(idx == 0)return arr[idx];
        return Math.max(mx(arr,idx-1),arr[idx]);
           }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("give length of array :- ");
       int arr[] = new int[sc.nextInt()];
        System.out.print("give array elements :- ");
        for(int i=0 ; i < arr.length ; i++)
            arr[i] = sc.nextInt();
     System.out.println( mx(arr , arr.length-1)); 
        
    }
}