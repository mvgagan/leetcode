class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String temp = String.valueOf(i);
            int n = temp.length();
            if (n % 2 == 0) {
                int left = 0;
                int right = 0;
                for (int j = 0; j < n / 2; j++) {
                    left += temp.charAt(j);
                    right += temp.charAt(n / 2 + j);
                }
                if (left == right) {
                    count++;
                }
            }
        }
        return count;
    }
}