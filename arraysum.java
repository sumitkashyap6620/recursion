import java.util.*;
public class arraysum{
    public static int sum(int[] arr ,int idx){
        if(idx == arr.length-1)return arr[idx];
        return arr[idx]+sum(arr,idx+1);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("give length of array :- ");
       int arr[] = new int[sc.nextInt()];
        System.out.print("give array elements :- ");
        for(int i=0 ; i < arr.length ; i++)
            arr[i] = sc.nextInt();
     System.out.println( sum(arr , 0)); 
        
    }
}