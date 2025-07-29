import java.util.Scanner;

public class BinaryFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 255: ");
        int num = scanner.nextInt();
        if (num<1 || num>255) {
            System.out.println("Invalid input. Please enter a number between 1 and 255.");
            return;
        }
        String binaryString = String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
        System.out.println("Binary representation results of given num: " + binaryString);
    }
}
