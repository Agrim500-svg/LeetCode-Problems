class Solution {
    public int[] plusOne(int[] digits) {
        // for(int i=digits.length-1;i>=0;i--){
        //     digits[i]+=1;
        //     break;
        // }
        // return digits;
        // int r=0;
        // for(int i=0;i<digits.length;i++){
        //     r=r*10+digits[i];
        // }
        // int t=r+1;
        // int [] ans = new int[digits.length];
        // ans=Integer.toString(t).chars().map(c -> c - '0').toArray();
        // return ans

        for (int i=digits.length-1;i>=0;i--){
            if(digits[i]<9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}

