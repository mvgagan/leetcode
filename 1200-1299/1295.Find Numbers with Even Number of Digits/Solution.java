class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (helper(num)) {
                count++;
            }
        }
        return count;
    }

    private boolean helper(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count % 2 == 0 ? true : false;
    }
}