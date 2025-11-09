import java.math.BigInteger;
import java.util.*;
public class solution{
     public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     }
 
     public static void display(ListNode x){
        
        while(x != null ){
            System.out.print(x.val);
            x = x.next ;
        }
       }
       public static long number(ListNode h){
        String s = "0";
        BigInteger num = BigInteger.valueOf(0);
         num = num*5;
         int c1 = 0 ;
         int c2 = 0 ;
        while(h != null){
           num = num * 10 ;
            num += h.val ;
            h = h.next ;
            c1++ ;
        }
        
       long ans =  0 ;
       while (num != 0) {
            long digit = num % 10;
            ans = ans * 10 + digit;
            num /= 10;
        }
        long count2 = ans ;
        while(count2!=0){
        count2 = count2/10 ;
           c2++;
        }
        while(c2!=c1){
            ans = ans * 10 ;
            c2++;
        }
       
        return ans ;
     }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(0);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        ListNode l5 = new ListNode(0);
        ListNode l6 = new ListNode(0);
        ListNode l7 = new ListNode(0);
        ListNode l8 = new ListNode(0);
        ListNode l9 = new ListNode(1);
       // ListNode l10 = new ListNode(9);
        l1.next = l2 ;
        l2.next = l3 ;
        l3.next = l4 ;
        l4.next = l5 ;
        l5.next = l6 ;
        l6.next = l7 ;
        l7.next = l8 ;
        l8.next = l9 ;
        l9.next = null; 
      display(l1);
      System.out.println();
      System.out.println( number(l1) +" helloguys");
    }
}