import java.util.*;
public class HandsOn12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
    }
}
