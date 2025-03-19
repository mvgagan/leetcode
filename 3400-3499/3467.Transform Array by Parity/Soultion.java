class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int index = nums.length - 1;
        for (int num : nums) {
            if (num % 2 != 0) {
                ans[index--] = 1;
            }
        }
        return ans;
    }
}