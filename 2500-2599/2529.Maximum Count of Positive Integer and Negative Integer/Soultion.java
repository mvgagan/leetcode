import java.util.Arrays;

class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for (int num : nums) {
            if (num < 0) {
                neg++;
            } else if (num > 0) {
                pos++;
            } else {
                continue;
            }
        }
        return Math.max(pos, neg);
    }
}

class Solution1 {
    public int maximumCount(int[] nums) {
        int pos = (int) Arrays.stream(nums).filter(n -> n > 0).count();
        int neg = (int) Arrays.stream(nums).filter(n -> n < 0).count();
        return Math.max(pos, neg);
    }
}