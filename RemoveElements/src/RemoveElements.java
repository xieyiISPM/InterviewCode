public class RemoveElements {
    public static void main(String[] args){
        int [] nums = {0,5, 5, 2, 3, 0, 0};
        int val = 0;
        System.out.println(removeElement(nums, val));
        for(int i = 0; i< nums.length; i++){
            System.out.print(nums[i]);
        }
        System.out.println("");
    }

    public static int removeElement(int[] nums, int val) {
        int p1 = 0;
        int p2 = 0;
        if(nums.length == 0){
            return 0;
        }
        while(p2 < nums.length){
            if(nums[p2] != val){
                nums[p1] = nums[p2];
                p1++;
            }
            p2++;

        }
        return  p1;
    }
}
