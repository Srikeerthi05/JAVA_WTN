public class HandsOn7 {
    public static void main(String[] args) {
        int a[]={12,34,12,45,67,89};
        int temp[]=new int[a.length];
        int indx=0;
        for(int i=0;i<a.length;i++){
            boolean f=false;
            for(int j=0;j<a.length;j++){
                if(a[i]==temp[j]){
                    f=true;
                    break;
                }

            }
            if(f==false){
                temp[indx]=a[i];
                indx++;
            }
        }
        for(int i=0;i<indx;i++){
            System.out.print(temp[i]+" ");
        }

    }
}
