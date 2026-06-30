class Solution {

    public long countVowels(String word) {
        long vowel_count = 0;
        long len = word.length();
        long ans = 0;

        for (int i = 0; i < len; i++) {
            if (isVowel(word.charAt(i))) vowel_count+=i+1;
            ans += vowel_count;
        }

        return ans;
    }

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
