import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        List<String> list = new ArrayList<>();
        Map<Integer, String> map = new TreeMap<>((v1, v2) -> v2 - v1);
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        for (String str : map.values()) {
            list.add(str);
        }
        return list.toArray(String[]::new);
    }
}