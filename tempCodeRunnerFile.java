import java.util.Scanner;
public class sumofdigit{
    public static int sod(int num){
       if(num==0)return 0 ;
       return num%10 + sod(num/10);
       
    }
    public static void main(String args[]){