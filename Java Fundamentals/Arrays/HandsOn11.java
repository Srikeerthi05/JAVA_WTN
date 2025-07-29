import java.util.*;
public class HandsOn11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        boolean f=true;
        for(int num : nums) {
            if(num!=1 && num!=4) {
                f=false;
                break;
            }
        }
        System.out.println(f);
    }
    
}


