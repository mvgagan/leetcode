import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int ans = 0;
        int ansC = 0;
        int curr = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                curr = 1;
            } else {
                curr++;
            }
            if (curr > ansC) {
                ans = nums[i];
                ansC = curr;
            }
        }
        return ans;
    }
}

class Solution2 {
    public int majorityElement(int[] nums) {
        int ans = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                ans = num;
            }
            if (ans == num) {
                count++;
            } else {
                count--;
            }
        }
        return ans;
    }
}