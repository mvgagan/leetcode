class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int n = height.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int temp = (j - i) * Math.min(height[i], height[j]);
            maxWater = Math.max(maxWater, temp);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxWater;
    }
}