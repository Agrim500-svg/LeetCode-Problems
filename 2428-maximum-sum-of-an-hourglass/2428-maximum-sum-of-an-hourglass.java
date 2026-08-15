class Solution {
    public int maxSum(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        //int [][]mat = new mat[r][c];
        int sum=0;
        int msum=Integer.MIN_VALUE;
        if(r<3 || c<3){
            return 0;
        }else{
            for(int i=0;i<r-2;i++){
                for(int j=0;j<c-2;j++){
                    sum=(mat[i][j]+mat[i][j+1]+mat[i][j+2]+mat[i+1][j+1]+mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2]);
                    msum=Math.max(sum,msum);
                }
            }
        }
        return msum;
    }
}