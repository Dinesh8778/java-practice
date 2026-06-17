class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int freq[] = new int[26];

        for (int i = 0; i < n; i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s2.length() - n ; i++) {
            String s = s2.substring(i, i + n);

            int[] freq2 = new int[26];

            for (int j = 0; j < s.length(); j++) {
                freq2[s.charAt(j) - 'a']++;
            }

            if (Arrays.equals(freq, freq2))
                return true;
        }

        return false;
    }
}