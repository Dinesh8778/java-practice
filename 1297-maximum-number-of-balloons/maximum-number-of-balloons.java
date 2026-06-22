class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        String p = "balloon";

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i) - 'a']++;
        }

        return Math.min(
            freq[1], Math.min(freq[0], Math.min(freq[11] / 2, Math.min(freq[14] / 2, freq[13]))));
    }
}