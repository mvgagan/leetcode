class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int[] arr = new int[3];
        int n = s.length();
        int curCount = 0;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            arr[ch - 'a']++;
            if (arr[ch - 'a'] == 1) {
                curCount++;
            }
            while (curCount == 3) {
                count += n - right;
                char c = s.charAt(left);
                arr[c - 'a']--;
                if (arr[c - 'a'] == 0) {
                    curCount--;
                }
                left++;
            }
        }

        return count;
    }
}