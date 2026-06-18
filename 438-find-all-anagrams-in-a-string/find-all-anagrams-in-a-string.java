class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n1 = s.length();
        int n2 = p.length();

        // if(n1 <= n2){
        //     return list;
        // }

        for(int i = 0; i <= n1 - n2; i++){
            String sub = s.substring(i, i+n2);

            if(anagram(sub, p)){
                list.add(i);
            }
        }

        return list;
    }

    private boolean anagram(String s, String p){
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i = 0; i < p.length(); i++){
            freq1[s.charAt(i) - 'a'] ++;
            freq2[p.charAt(i) - 'a'] ++;
        }

        return Arrays.equals(freq1, freq2);
    }
}