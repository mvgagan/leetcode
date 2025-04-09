class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        for (int num: nums) {
            if (num < k) {
                return -1;
            }
            min = Math.min(min, num);
            set.add(num);
        }
        return set.size() - (k == min ? 1 : 0);
    }
}