class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int[] arr : accounts) {
            int temp = 0;
            for (int num : arr) {
                temp += num;
            }
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}