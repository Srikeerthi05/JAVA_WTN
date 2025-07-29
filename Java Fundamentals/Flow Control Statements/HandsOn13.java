public class HandsOn13 {
    public static void main(String[] args) {
        for(int i=10;i<=99;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        return false;
    }
    
}
