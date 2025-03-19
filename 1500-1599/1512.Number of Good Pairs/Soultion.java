class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans++;
                }
            }
        }
        return ans;
    }
}

class Solution1 {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] arr = new int[101];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for (int num : arr) {
            ans += (num * (num - 1)) / 2;
        }
        return ans;
    }
}