import java.util.*;
class InvalidMarkException extends Exception{

    public InvalidMarkException(String message) {
        super(message);
    }
    
}
class Exc3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] name=new String[2];
        int[][] marks=new int[2][3];
        for(int i=0;i<2;i++){
            try {
                System.out.println("Enter the name of the student:");
                name[i]=sc.nextLine();
                for(int j=0;j<3;j++){
                    System.out.println("Enter "+(j+1)+" marks of the student");
                    String input=sc.nextLine();
                    int mark=Integer.parseInt(input);
                    if(mark<0 || mark>100){
                        throw new InvalidMarkException("Mark must be between 0 and 100");
                    }
                    marks[i][j]=mark;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, enter integer values only");
                i--;
            }
            catch(InvalidMarkException e){
                System.out.println(e.getMessage());
                i--;
            }
        }
        for(int i=0;i<2;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                sum+=marks[i][j];
            }
            double avg=sum/3.0;
            System.out.println(avg);
        }
    }
}