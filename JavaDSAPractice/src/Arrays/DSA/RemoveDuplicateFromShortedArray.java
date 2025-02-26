package Arrays.DSA;

public class RemoveDuplicateFromShortedArray {
    public int removeDuplicates(int[] nums) {
        int pointer1 = 0;
        int pointer2 = 0;
        int count = 1;

        while(pointer2<nums.length){
            if(nums[pointer1] == nums[pointer2]){
                pointer2++;
            }

            else if(nums[pointer1] != nums[pointer2]){
                pointer1++;
                nums[pointer1] = nums[pointer2];
                pointer2++;
                count++;
            }
        }

        return count;
    }
}
