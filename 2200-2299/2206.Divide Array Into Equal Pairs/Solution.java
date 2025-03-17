import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}

class Solution1 {
    public boolean divideArray(int[] nums) {
        int[] arr = new int[501];
        for (int num : nums) {
            arr[num]++;
        }
        for (int num : arr) {
            if (num % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}