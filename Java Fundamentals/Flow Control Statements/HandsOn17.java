import java.util.*;
public class HandsOn17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println(n+" is a palindrome");
        }else{
            System.out.println(n+" is not a palindrome");
        }
        
    }
}