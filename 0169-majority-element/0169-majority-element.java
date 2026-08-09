// class Solution {
//     public int majorityElement(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             int count=1;
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//                 // System.out.println(count);
//             }
//             if(count>nums.length/2){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int candidate =0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                candidate=nums[i];
                cnt=1;
            }else if(candidate==nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        int majCnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate){
                majCnt++;
            }
        }
        if(majCnt>nums.length/2){
            return candidate;
        }
        return -1;    
    }
}