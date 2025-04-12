class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max = 0;
        int min = 101;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        for (int num : nums) {
            if (num != min && num != max) {
                return num;
            }
        }
        return -1;
    }
}