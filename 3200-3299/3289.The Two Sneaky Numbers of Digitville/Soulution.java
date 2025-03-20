class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[100];
        int[] ans = new int[2];
        for (int num : nums) {
            arr[num]++;
        }
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                ans[pos++] = i;
            }
        }
        return ans;
    }
}