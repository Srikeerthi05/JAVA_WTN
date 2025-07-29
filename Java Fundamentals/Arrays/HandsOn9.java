public class HandsOn9 {
    public static void main(String[] args){
        int nums1[]={1,10,10,2};
        int res[]=withoutTen(nums1);
        for(int n:res){
            System.out.print(n+" ");
        }
        System.out.println();

        int nums2[]={10,2,10};
        int res2[]=withoutTen(nums2);
        for(int n:res2){
            System.out.print(n+" ");
        }
        System.out.println();

        int nums3[]={1,99,10};
        int res3[]=withoutTen(nums3);
        for(int n:res3){
            System.out.print(n+" ");
        }
        System.out.println();
        
    }
    public static int[] withoutTen(int[] nums) {
        int[] result=new int[nums.length];
        int index = 0;
        for (int i=0;i<nums.length;i++) {
            if(nums[i]!= 10){
                result[index++]=nums[i];
            }
        }
    return result;
}

}
