import java.util.Scanner ;
public class sumOfsubsets{

    public static void subsum(int[] arr , int sum ,int idx ){
        if(idx == arr.length){
            System.out.println(sum);
            return ;
        }
        int cur = arr[idx] ;
        subsum(arr, cur+sum, idx+1);
        subsum(arr, sum, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give length :- ");
        int[] arr = new int[sc.nextInt()];
        System.out.print("Array elements :- ");
        for(int i = 0 ; i < arr.length ; i++)
        arr[i] = sc.nextInt() ;
         subsum(arr , 0 , 0) ; 
    }
}