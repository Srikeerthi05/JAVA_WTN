import java.util.*;
public class HandsOn8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        boolean f=false;
         for(int i=0;i<n;i++){
            if(a[i] == 6){
                f=true;
            } 
            if(!f){
                sum+=a[i];
            }
            if(f && a[i]==7){
                f=false;
            }
        }
        System.out.println(sum);
    }
}
