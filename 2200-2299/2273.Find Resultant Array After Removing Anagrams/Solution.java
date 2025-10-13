import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length;) {
            int j = i + 1;
            while (j < words.length && checkAnagrams(words[i], words[j])) {
                j++;
            }
            list.add(words[i]);
            i = j;
        }

        return list;
    }

    private boolean checkAnagrams(String str1, String str2) {
        int[] arr = new int[26];

        for (char c : str1.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            arr[c - 'a']--;
        }
        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}