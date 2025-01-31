class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        int ans = 0;
        if(nums[0] < nums[nums.length-1]) {
            return nums[0];
        }
        else {
            for(int i = 0; i<nums.length - 1; i++) {
                if(nums[i] > nums[i+1]) {
                    ans = nums[i+1];
                    break;
                }
            }
        }
        return ans;
    }
}