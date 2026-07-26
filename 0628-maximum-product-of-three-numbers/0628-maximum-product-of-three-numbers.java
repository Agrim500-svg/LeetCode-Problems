class Solution {
    public int maximumProduct(int[] nums) {
        int res1=0;
        int res2=0;
        Arrays.sort(nums);
        res1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        res2=nums[0]*nums[1]*nums[nums.length-1];
        return Math.max(res1,res2);


    }
}
