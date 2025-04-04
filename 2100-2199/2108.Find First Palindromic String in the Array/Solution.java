class Solution {
    public String firstPalindrome(String[] words) {
        for (String str : words) {
            if (helper(str)) {
                return str;
            }
        }
        return "";
    }

    private boolean helper(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
}

class Solution {
    public String firstPalindrome(String[] words) {
        for (String str : words) {
            if (helper(str)) {
                return str;
            }
        }
        return "";
    }

    private boolean helper(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}