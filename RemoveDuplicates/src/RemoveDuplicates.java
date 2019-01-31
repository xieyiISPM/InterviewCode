public class RemoveDuplicates {
    public static void main(String[] args){
        int [] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
        for(int i = 0; i< nums.length; i++){
            System.out.print(nums[i]);
        }
        System.out.println("");

    }

    public static int removeDuplicates(int[] nums) {
        int p1 = 0;
        int p2 = 1;
        if(nums.length == 0){
            return 0;
        }
        while(p2 < nums.length){
            if(nums[p2] <= nums[p1]){
                p2++;
            }
            else{
                p1++;
                nums[p1] = nums[p2];

            }
        }
        return  ++p1;
    }
}
