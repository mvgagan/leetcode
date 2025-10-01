import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[10];
        for (int digit : digits) {
            arr[digit]++;
        }
        for (int i = 100; i < 999; i += 2) {
            if (helper(i, arr)) {
                list.add(i);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    private boolean helper(int num, int[] arr) {
        int[] temp = new int[10];
        for (char c : String.valueOf(num).toCharArray()) {
            temp[Integer.parseInt(String.valueOf(c))]++;
        }
        for (int i = 0; i < 10; i++) {
            if (temp[i] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}