class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        if (map.size() < 2) {
            return 0;
        }

        int max = 0;

        for (int i : map.keySet()) {
            if (map.containsKey(i + 1)) {
                max = Math.max(max, (map.get(i) + map.get(i + 1)));
            }
        }

        return max;
    }
}