public class Solution {
    public int MaxDistinct(string s) {
        HashSet<char> set = new HashSet<char>(s);

        return set.Count();
    }
}