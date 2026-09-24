
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solve(0, nums, ds, ans);

        return ans;
    }

    public void solve(int index, int[] nums, List<Integer> ds,
                      List<List<Integer>> ans) {

        if (ds.size() >= 2) {
            ans.add(new ArrayList<>(ds));
        }

        Set<Integer> set = new HashSet<>();

        for (int i = index; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                continue;
            }

            if (ds.isEmpty() || nums[i] >= ds.get(ds.size() - 1)) {

                set.add(nums[i]);
                ds.add(nums[i]);

                solve(i + 1, nums, ds, ans);

                ds.remove(ds.size() - 1);
            }
        }
    }
}