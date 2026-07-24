class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length;i++){
            sum+= nums[i];
        }
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                dsum+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
        }
        return Math.abs(sum-dsum);
        
    }
}