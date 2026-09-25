class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(count.containsKey(nums[i])){
                return true;
            }else{
                count.put(nums[i],1);
            }
        }
        return false;
    }
}