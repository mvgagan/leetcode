class Solution {
    public int countLargestGroup(int n) {
        int[] arr = new int[40];
        int max = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int sum = helper(i);
            arr[sum]++;

            if (max < arr[sum]) {
                max = arr[sum];
                count = 1;
            } else if (max == arr[sum]) {
                count++;
            }
        }
        return count;
    }

    private int helper(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}