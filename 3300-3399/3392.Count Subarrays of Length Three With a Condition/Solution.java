class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 2; i < n; i++) {
            if ((nums[i] + nums[i - 2]) * 2 == (nums[i - 1])) {
                count++;
            }
        }
        return count;
    }
}