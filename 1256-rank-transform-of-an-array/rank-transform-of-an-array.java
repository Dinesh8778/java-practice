class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);

        int[] ans = new int[arr.length];

        int rank = 1;

        Map<Integer, Integer> map = new HashMap();

        for (int i : temp) {
            if (map.containsKey(i))
                continue;
            map.put(i, rank++);
        }

        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}