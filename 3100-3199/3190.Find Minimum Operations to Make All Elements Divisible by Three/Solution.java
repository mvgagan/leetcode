class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] % 3;
            ans += Math.min(nums[i] - 0, Math.abs(3 - nums[i]));
        }
        return ans;
    }
}

class Solution1 {
    public int minimumOperations(int[] nums) {
        int ops = 0;
        for (int i : nums) {
            if (i % 3 != 0) {
                ops++;
            }
        }
        return ops;
    }
}