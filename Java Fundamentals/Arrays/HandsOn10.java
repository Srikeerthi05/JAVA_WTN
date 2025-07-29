public class HandsOn10 {
    public static void main(String[] args){
        int nums1[]={1,0,1,0,0,1,1};
        int res[]=evenOdd(nums1);
        for(int n:res){
            System.out.print(n+" ");
        }
        System.out.println();

        int nums2[]={3,3,2};
        int res2[]=evenOdd(nums2);
        for(int n:res2){
            System.out.print(n+" ");
        }
        System.out.println();

        int nums3[]={2,2,2};
        int res3[]=evenOdd(nums3);
        for(int n:res3){
            System.out.print(n+" ");
        }
        System.out.println();
        
    }

    public static int[] evenOdd(int[] nums) {
    int[] result = new int[nums.length];
    int evenIndex = 0;
    int oddIndex = nums.length - 1;

    for (int num : nums) {
        if (num % 2 == 0) {
            result[evenIndex++]=num;
        } 
        else {
            result[oddIndex--]=num;
        }
    }
    return result;
}

}
