import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Number> numberList = new ArrayList<>();
        
        numberList.add(10);           // int (autoboxed to Integer)
        numberList.add(15.5f);        // float
        numberList.add(20.75);        // double
        numberList.add(100L);         // long

        // Print the list
        System.out.println("Numbers in the ArrayList:");
        for (Number num : numberList) {
            System.out.println(num);
        }
    }
}
