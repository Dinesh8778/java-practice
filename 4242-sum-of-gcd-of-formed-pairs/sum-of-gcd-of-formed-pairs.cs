public class Solution {
    public long GcdSum(int[] nums) {
        if(nums.Length == 1)
            return 0l;

        int[] preGCD = new int[nums.Length];
        int max = nums[0];

        for(int i = 0 ; i < nums.Length ; i++){
            max = Math.Max(max,nums[i]);
            preGCD[i] = GCD(max,nums[i]);
        }

        foreach(int i in preGCD){
            Console.Write(i+" ");
        }

        Array.Sort(preGCD);

        long sum = 0l;

        int l = 0 , r = nums.Length-1;

        while(l<r){

            sum += (long) GCD(preGCD[l], preGCD[r]);
            l++;
            r--;
        }

        return sum;
    }

    public static int GCD(int a, int b){
        if(b == 0) return a;
        return GCD(b,a%b);
    }
}