import java.util.*;

class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        List<Double> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            list.add((double) (nums[i] + nums[j]) / 2);
        }
        double min = Double.MAX_VALUE;
        for (double num : list) {
            min = Math.min(num, min);
        }
        return min;
    }
}