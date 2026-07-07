public class Solution {
    public long SumAndMultiply(int n) {

        if(n == 0){
            return 0;
        }

        int sum = 0;

        string s = Convert.ToString(n);

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.Length ; i++){
            if(s[i] != '0'){
                sb.Append(s[i]);
                sum += (s[i] - '0');
            }
        }
         
        long num = long.Parse(sb.ToString());
        return sum*num;
    }
}