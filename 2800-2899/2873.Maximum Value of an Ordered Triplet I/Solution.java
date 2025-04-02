class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long ans = 0l;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    long temp = (long) (nums[i] - nums[j]) * nums[k];
                    ans = Math.max(ans, temp);
                }
            }
        }
        return ans;
    }
}