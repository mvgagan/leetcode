class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    ans[index++] = prices[i] - prices[j];
                    break;
                }
                if (j == n - 1 && ans[i] == 0) {
                    ans[index++] = prices[i];
                }
            }
        }
        if (ans[n - 1] == 0) {
            ans[n - 1] = prices[n - 1];
        }
        return ans;
    }
}