class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
        int[] hash = new int[100];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<hash.length;i++){
            if(hash[i]>1){
                arr[j]=i;
                j++;
            }
        }
        return arr;
    }
}