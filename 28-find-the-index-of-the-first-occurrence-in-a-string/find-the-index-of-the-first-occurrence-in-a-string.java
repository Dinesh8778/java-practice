class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() == needle.length()) {
            if (haystack.equals(needle))
                return 0;
            else
                return -1;
        }

        int n = needle.length();
        
        for (int i = 0; i <= haystack.length() - n; i++) {
            String s = haystack.substring(i, i + n);

            if (s.equals(needle))
                return i;
        }

        return -1;
    }
}