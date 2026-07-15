public class Solution {
    public int GcdOfOddEvenSums(int n) {
        return GCD((n * n) , (n * (n - 1)));
    }
    static int GCD(int a, int b){
        if(b == 0)
            return a;
        return GCD(b, a%b);
    }
}