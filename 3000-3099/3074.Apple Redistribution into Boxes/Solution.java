import java.util.*;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int ans = 0;
        int apples = 0;
        for (int num : apple) {
            apples += num;
        }
        Arrays.sort(capacity);
        for (int i = capacity.length - 1; i >= 0; i--) {
            ans++;
            apples -= capacity[i];
            if (apples <= 0)
                break;
        }
        return ans;
    }
}