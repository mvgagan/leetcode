class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        long maxDiff = 0;
        long currMax = 0;

        for (int num : nums) {
            ans = Math.max(ans, maxDiff * num);
            currMax = Math.max(currMax, num);
            maxDiff = Math.max(maxDiff, currMax - num);
        }

        return ans;
    }
}