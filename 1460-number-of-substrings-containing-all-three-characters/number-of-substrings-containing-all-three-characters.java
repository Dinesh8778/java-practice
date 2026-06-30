class Solution {

    public int numberOfSubstrings(String s) {
        int left = 0;
        int abc[] = new int[3];

        int count = 0;

        for (int r = 0; r < s.length(); r++) {
            abc[s.charAt(r) - 'a']++;

            while (abc[0] > 0 && abc[1] > 0 && abc[2] > 0) {
                count += s.length() - r;
                abc[s.charAt(left++) - 'a']--;
            }
        }

        return count;
    }
}
