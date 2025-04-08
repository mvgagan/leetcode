class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i += 3) {
            if (!helper(i, nums)) {
                count++;
            }
        }
        return count;
    }

    private boolean helper(int index, int[] nums) {
        int[] arr = new int[101];
        for (int i = index; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for (int i : arr) {
            if (i > 1) {
                return false;
            }
        }
        return true;
    }
}