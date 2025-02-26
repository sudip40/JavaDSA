package Arrays.DSA;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;

        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum<target){
                left++;
            } else if(sum>target){
                right--;
            } else{
                break;
            }
        }
        return new int[]{left, right};
    }
}
