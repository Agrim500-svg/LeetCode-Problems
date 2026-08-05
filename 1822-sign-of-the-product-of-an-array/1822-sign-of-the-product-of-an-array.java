// class Solution {
//     public int arraySign(int[] nums) {
//         int prd=1;
//         for(int i=0;i<nums.length;i++){
//             prd = prd.multiply(BigInteger.valueOf(nums[i]));
//         }
//         System.out.println(prd);
//         return signFunc(prd); 
//     }
//     public int signFunc(int x){
//         if(x>0){
//             return 1;
//         }else if(x<0){
//             return -1;
//         }else{
//             return 0;
//         }
//     }
// }
class Solution {
    public int arraySign(int[] nums){
        int sign=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }else if(nums[i]<0){
                sign=-sign;
            }
        }
        return sign;
    }
}