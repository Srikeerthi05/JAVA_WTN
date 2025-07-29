import java.util.*;
class Exc1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the number of the elements:");
            int n=sc.nextInt();
            System.out.println("Enter the elements:");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the index of the array you want to access");
            int id=sc.nextInt();
            System.out.println("The array element at index "+id+" is: "+a[id]);
            System.out.println("Array element accessed successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}