import java.util.*;

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for (int i = 0; i + (2 * k) <= nums.size(); i++) {
            if (helper(nums, i, i + k) && helper(nums, i + k, i + k + k)) {
                return true;
            }
        }

        return false;
    }

    private boolean helper(List<Integer> nums, int a, int b) {
        for (int i = a; i < b - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

class Solution1 {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int prevRun = 0;
        int currRun = 1;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) < nums.get(i + 1)) {
                currRun++;
            } else {
                prevRun = currRun;
                currRun = 1;
            }
            if (currRun / 2 >= k) {
                return true;
            }
            if (Math.min(prevRun, currRun) >= k) {
                return true;
            }
        }

        return false;
    }
}