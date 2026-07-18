public class Solution {
    public int FindGCD(int[] nums) {
        int max = 0, min = 10000;

        foreach(int i in nums){
            if(max < i) max = i;
            if(min > i) min = i;
        }

        return GCD(min, max);
    }

    public static int GCD(int a, int b){
        if(b == 0) return a;
        return GCD(b, a%b);
    }
}