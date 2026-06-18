class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n1 = s.length();
        int n2 = p.length();

        if(n2 > n1)
            return list;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i = 0; i < n2; i++){
            freq1[s.charAt(i) - 'a']++;
            freq2[p.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freq1, freq2))
            list.add(0);

        for(int i = n2; i < n1; i++){

            freq1[s.charAt(i) - 'a'] ++;
            freq1[s.charAt(i-n2) - 'a'] --;

            if(Arrays.equals(freq1, freq2))
                list.add(i - n2 + 1);
        }

        return list;
    }
}