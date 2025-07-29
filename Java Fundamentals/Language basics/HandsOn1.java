class HandsOn1{
    public static void main(String[] args){
        if(args.length!=2){
            System.out.println("Provide exactly two command line arguments.");
            return;
        }
        System.out.println(args[0]+" Technologies "+args[1]);
    }
}