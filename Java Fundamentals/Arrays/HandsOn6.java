import java.util.*;
public class HandsOn6 {
    public static void main(String[] args) {
        int[] arr = {12,2,7,80,29,5,77};
        System.out.println("Array before sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Array after sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
