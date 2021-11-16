public class longestSubstringWithoutRepeatingCharacters {
    public int lengthofLongestSubstring(String s) {
        int n = s.length();

        int res = 0;
        for (int i = 0; i < n; i ++) {
            for (int j = i; j < n; j++) {
                if (checkRepetitions(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }

    private boolean checkRepetition(String s, int start, int end) {
        int[] chars = new int[128];

        for(int i = start; i <= end, i++) {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] > 1) {
                return false;
            }
        }

        return true;
    }
}

//int[26] for letters 'a' -'z' or 'A' - 'Z'
//int[128] for ASCII
//int [256] for Extend ASCII