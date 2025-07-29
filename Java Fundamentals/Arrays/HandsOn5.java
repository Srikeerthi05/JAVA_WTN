import java.util.*;
public class HandsOn5 {
    public static void main(String[] args) {
        int[] arr = {12,2,7,80,29,5,77};
        Arrays.sort(arr);
        System.out.println("Largest two numbers: " + arr[arr.length - 1] + " " + arr[arr.length - 2]);
        System.out.println("Smallest two numbers: " + arr[0] + " " + arr[1]);
    }
}
