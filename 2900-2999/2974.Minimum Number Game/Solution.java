class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int index = 0;
        Arrays.sort(nums);
        for (int i = 1; i < n; i += 2) {
            ans[index++] = nums[i];
            ans[index++] = nums[i - 1];
        }
        return ans;
    }
}