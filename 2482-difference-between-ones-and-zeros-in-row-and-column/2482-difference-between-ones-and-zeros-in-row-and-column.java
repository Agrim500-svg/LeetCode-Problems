class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int[][] diff = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int onesRow = row[i];
                int onesCol = col[j];
                int zeroRow = n - onesRow;
                int zeroCol = m - onesCol;
                diff[i][j] = onesRow + onesCol - zeroRow - zeroCol;
            }
        }

        return diff;
    }
}