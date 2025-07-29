public class HandsOn7 {
    public static void main(String[] args) {
        char c=args[0].charAt(0);
        if(Character.isUpperCase(c)){
            System.out.println(Character.toLowerCase(c));
        }
        else if(Character.isLowerCase(c)){
            System.out.println(Character.toUpperCase(c));
        }
        else{
            System.out.println(c+" is not an alphabet");
        }
    }
}
