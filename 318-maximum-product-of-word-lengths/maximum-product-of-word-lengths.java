class Solution {

    public int maxProduct(String[] words) {
        int max = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (checkLetter(words[i], words[j])) {
                    int len = words[i].length() * words[j].length();
                    max = Math.max(max, len);
                }
            }
        }
        return max;
    }

    boolean checkLetter(String s, String t) {
        boolean[] freq1 = new boolean[26];
        boolean[] freq2 = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            freq1[s.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < t.length(); i++) {
            freq2[t.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (freq1[i] && freq2[i]) {
                return false;
            }
        }
        return true;
    }
}
