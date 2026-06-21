class Solution {
    public int maxIceCream(int[] costs, int coins) {

        int n = costs.length;
        Arrays.sort(costs);

        int sum = 0,
                count = 0;

        for (int i : costs) {
            if (sum > coins)
                return count;
            sum += i;
            if (sum <= coins)
                count++;

        }

        return count;
    }
}