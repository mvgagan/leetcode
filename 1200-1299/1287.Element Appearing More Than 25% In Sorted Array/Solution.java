class Solution {
    public int findSpecialInteger(int[] nums) {
        int n = nums.length;
        int twoFive = n / 4;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == nums[i]) {
                count++;
                if (count > twoFive) {
                    return nums[i];
                }
            } else {
                count = 1;
            }
        }
        return nums[0];
    }
}

class Solution1 {
    public int findSpecialInteger(int[] nums) {
        int n = nums.length;
        int twoFive = n / 4;
        for (int i = 0; i < n - twoFive; i++) {
            if (nums[i] == nums[i + twoFive]) {
                return nums[i];
            }
        }
        return nums[0];
    }
}