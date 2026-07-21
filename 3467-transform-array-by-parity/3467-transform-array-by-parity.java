class Solution {
    public int[] transformArray(int[] nums) {
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[i]=0;
            }else{
                res[i]=1;
            }
        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res.length-i-1;j++){
                if(res[j]>res[j+1]){
                    int temp = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = temp;
                }
            }
        }
        return res; 
    }

}     