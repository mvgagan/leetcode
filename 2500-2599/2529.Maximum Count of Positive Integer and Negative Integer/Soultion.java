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

class Solution2 {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int negIndex = binarySearch(nums, 0, n - 1, -1);
        int posIndex = binarySearch(nums, negIndex, n - 1, 0);
        int posCount = n - posIndex;
        return Math.max(negIndex, posCount);
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
        while (start >= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid - 1;
            } else {
                end = mid + 1;
            }
        }
        return start;
    }
}