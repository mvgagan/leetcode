class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[i] = max;
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return ans;
    }
}