import java.util.* ;
public class frogjump{
    public static int jump(int[] arr , int idx ){
      if(idx == arr.length-1) return 0 ;
      int op1 = Math.abs(arr[idx] - arr[idx+1]) + jump(arr, idx+1);
      if(idx == arr.length-2)return op1 ;
      int op2 = Math.abs(arr[idx] - arr[idx+2]) + jump(arr, idx+2) ; 
      return Math.min(op1 ,op2) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give number of stones :- ");
        int arr[] = new int [sc.nextInt()];
        System.out.print("Give size of all stones :- ");
        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = sc.nextInt() ;
        System.out.println("minimum cost = " + jump(arr,0));
    }
}