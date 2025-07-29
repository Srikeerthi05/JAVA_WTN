public class HandsOn1A {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        if(n>0){
            System.out.println(n+" is positive");
        }
        else if(n<0){
            System.out.println(n+" is negative");
        }
        else{
            System.out.println("Number is 0");
        }
    }
    
}
