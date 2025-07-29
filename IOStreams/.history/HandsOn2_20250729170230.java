import java.io.*;
import java.util.*;
class HandsOn2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the input file name: ");
            String ip=sc.nextLine();
             System.out.println("Enter the output file name: ");
            String op=sc.nextLine();
            FileReader fr=new FileReader(ip);
            FileWriter fw=new FileWriter(op);
            int c;
            while((C=fr.read())!=-1){
                fw.write(c);
            }
            fr.close();
            fw.close();
            System.out.println("File is copied.");
        }
        catch(IOException e){
            System.out.println("Error")
        }

            
    }
}