import java.util.ArrayList;
public class allindices{
public static ArrayList allIndices(int arr[] , int t , int idx){
   ArrayList <Integer> ans = new ArrayList<>();
//    base case 
   if(idx == arr.length) return ans ;
//  self work 
   if(arr[idx] == t )
   ans.add(idx);
// recursion work 
   ArrayList<Integer> sa = allIndices(arr,t,idx+1);
   ans.addAll(sa);
   return ans ;
}
    public static void main(String args[]){
     int arr[] = {1 , 2 , 2 , 4 , 2 , 3 , 6 , 2};
     ArrayList<Integer> ans = allIndices(arr , 2 , 0);
     for(Integer i : ans)
     System.out.print(i+" ");
    
}}