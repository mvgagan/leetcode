class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for (String str : operations) {
            if (str.equals("C")) {
                list.remove(list.size() - 1);
            } else if (str.equals("D")) {
                list.add(list.get(list.size() - 1) * 2);
            } else if (str.equals("+")) {
                list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
            } else {
                list.add(Integer.parseInt(str));
            }
        }
        int ans = 0;
        for (int i : list) {
            ans += i;
        }
        return ans;
    }
}