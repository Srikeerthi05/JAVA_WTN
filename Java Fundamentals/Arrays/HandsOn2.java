public class HandsOn2 {
    public static void main(String[] args) {
        int a[]={23,12,3,94,29};
        int maxNumber=Integer.MIN_VALUE;
        int minNumber=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            maxNumber=Math.max(maxNumber,a[i]);
            minNumber=Math.min(minNumber,a[i]);
        }
        System.out.println("Maximum value of array: "+maxNumber);
        System.out.println("Minimum value of array: "+minNumber);

    }
}
