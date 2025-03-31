class Solution {
    public int differenceOfSum(int[] nums) {
        int eSum = 0;
        int dSum = 0;
        for (int num : nums) {
            eSum += num;
            if (num > 9) {
                while (num > 0) {
                    dSum += num % 10;
                    num /= 10;
                }
            } else {
                dSum += num;
            }
        }

        return Math.abs(eSum - dSum);
    }
}