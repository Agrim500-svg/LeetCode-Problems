class Solution {
    public int countOdds(int low, int high) {
        // int cnt=0;
        // for(int i=low;i<=high;i++){
        //     if(i%2!=0){
        //         cnt++;
        //     }
        // }
        // return cnt;
        int n=high-low+1;
        if(n%2==0){
            return n/2;
        }else{
            if(low%2!=0 || high%2!=0){
                return n/2+1;
            }else{
                return n/2;
            }
        }
    }
}