class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            Integer.toString(nums[i]).chars().map(c -> c - '0').forEach(res::add);
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}