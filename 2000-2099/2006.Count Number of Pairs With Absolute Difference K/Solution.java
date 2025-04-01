class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}

class Solution1 {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        int[] arr = new int[101];
        for (int num : nums) {
            arr[num]++;
        }
        for (int i = 1 + k; i < 101; i++) {
            count += arr[i] * arr[i - k];
        }
        return count;
    }
}