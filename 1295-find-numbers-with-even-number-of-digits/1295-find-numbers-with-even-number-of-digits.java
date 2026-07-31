class Solution {
    public int findNumbers(int[] nums) {
        int digit[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            while (num != 0) {
                digit[i]++;
                num /= 10;
            }
        }
        int count=0;
        for(int i=0;i<digit.length;i++){
            if(digit[i]%2==0){
                count++;
            }
        }
        return count;
    }
}