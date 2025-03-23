class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        return (int) Arrays.stream(hours).filter(num -> num >= target).count();
    }
}

class Solution1 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        for (int hour : hours) {
            if (hour >= target) {
                ans++;
            }
        }
        return ans;
    }
}