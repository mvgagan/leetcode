class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (String str: sentences) {
            ans = Math.max(ans, str.split(" ").length);
        }
        return ans;
    }
}