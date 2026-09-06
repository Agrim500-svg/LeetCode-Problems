class Solution {
    public int minOperations(int n) {
        // int [] arr = new int [n];
        // for(int i=0;i<n;i++){
        //     arr[i]=(2*i)+1;
        // }
        // int cnt=0;
        // for(int i=0;i<n;i++){
        //     for(int j=n-1;j>=0;j--){
        //         while(arr[i]!=arr[j]){
        //             arr[j]-=1;
        //             arr[i]-=1;
        //             cnt++;
        //         }
        //     }
        // }
        // return cnt;
        return (n*n)/4;
        
    }
}