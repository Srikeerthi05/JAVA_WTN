import java.util.*;
class Exc2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the elements:");
            int a[]=new int[5];
            int sum=0,avg=0;
            for(int i=0;i<5;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            avg=sum/5;
            System.out.println("The sum and average of 5 elements are: "+sum+" "+avg);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter only integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic issue - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e);
        }
    }
}