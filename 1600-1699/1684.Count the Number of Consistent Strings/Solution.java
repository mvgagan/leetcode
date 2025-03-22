class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        for (String word : words) {
            if (helper(allowed, word)) {
                ans++;
            }
        }
        return ans;
    }

    private boolean helper(String allowed, String str) {
        for (char c : str.toCharArray()) {
            if (allowed.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}

class Solution2 {
    Set<Character> set;

    public int countConsistentStrings(String allowed, String[] words) {
        set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        int ans = 0;
        for (String word : words) {
            if (helper(set, word)) {
                ans++;
            }
        }
        return ans;
    }

    private boolean helper(Set<Character> set, String str) {
        for (char c : str.toCharArray()) {
            if (!set.contains(c)) {
                return false;
            }
        }
        return true;
    }
}