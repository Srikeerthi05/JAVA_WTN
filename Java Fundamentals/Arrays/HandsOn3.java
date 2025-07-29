import java.util.*;
public class HandsOn3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,4,34,56,7};
        int key=sc.nextInt();
        int index=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
