class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int index = helper(nums);
            nums[index] = nums[index] * multiplier;
        }
        return nums;
    }

    private int helper(int[] nums) {
        int low = Integer.MAX_VALUE;
        int lowIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < low) {
                low = nums[i];
                lowIndex = i;
            }
        }
        return lowIndex;
    }
}