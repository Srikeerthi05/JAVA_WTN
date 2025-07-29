public class HandsOn1{
    public static void main(String[] args){
        int a[]={12,9,94,29,3,5};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+(sum/a.length));
    }
}