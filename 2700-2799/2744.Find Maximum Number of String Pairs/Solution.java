import java.util.*;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (helper(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean helper(String str1, String str2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (char c : str1.toCharArray()) {
            arr1[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            arr2[c - 'a']++;
        }
        return Arrays.equals(arr1, arr2);
    }
}