class Solution {
    public int subarraySum(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            int temp = 0;
            for (int j = start; j <= i; j++) {
                temp += nums[j];
            }
            ans += temp;
        }
        return ans;
    }
}