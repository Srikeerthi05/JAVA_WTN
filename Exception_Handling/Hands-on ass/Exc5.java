import java.util.*;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}
class Exc5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            String name=sc.nextLine();
            int age=sc.nextInt();
            if(age<18 || age>=60){
                throw new InvalidAgeException("Age must be in range from 18 to 60");
            }
            else{
                System.out.println("Data is valid");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}