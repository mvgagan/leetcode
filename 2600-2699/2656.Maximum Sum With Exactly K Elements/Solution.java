class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        for (int i = 0; i < k; i++) {
            sum += max + i;
        }
        return sum;
    }
}