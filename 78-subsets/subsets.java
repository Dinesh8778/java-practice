class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        subset(0, nums, new ArrayList<>());
        return list;
    }

    public void subset(int idx, int[] nums, List<Integer> temp) {
        if (idx == nums.length) {
            list.add(new ArrayList(temp));
            return;
        }
        temp.add(nums[idx]);
        subset(idx + 1, nums, temp);
        temp.remove(temp.size() - 1);
        subset(idx + 1, nums, temp);
    }
}