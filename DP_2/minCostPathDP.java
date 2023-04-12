package DP_2;

public class minCostPathDP {
    public static void main(String[] args) {
        int[][] matrix = {{1,5,11},{8,13,12},{2,3,7}};
        System.out.println(minCost(matrix));
    }
    private static int minCost(int[][] matrix)
    {
        int nRows = matrix.length;
        if(nRows == 0){
            return Integer.MAX_VALUE;
        }
        int nCols = matrix[0].length;
        // Array for the Dynamic Programming
        int[][] dp = new int[nRows+1][nCols+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        return helper(matrix,dp,nRows,nCols,0,0);
    }
    private static int helper(int[][] matrix,int[][]dp, int nRows, int nCols, int currRow, int currCol)
    {
        if(currRow>=nRows || currCol>=nCols){
            return Integer.MAX_VALUE;
        }
        if(currRow==(nRows-1) && currCol==(nCols-1)){
            return matrix[currRow][currCol];
        }
        int downCost;
        if(dp[currRow+1][currCol] == Integer.MIN_VALUE)
        {
           downCost = helper(matrix,dp, nRows, nCols, currRow+1,currCol);
           dp[currRow+1][currCol] = downCost;
        }
        else
        {
            downCost = dp[currRow+1][currCol];
        }
        int diagonalCost;
        if(dp[currRow+1][currCol+1]==Integer.MIN_VALUE)
        {
            diagonalCost = helper(matrix, dp, nRows, nCols, currRow+1, currCol+1);
            dp[currRow+1][currCol+1] = diagonalCost;
        }
        else
        {
            diagonalCost = dp[currRow+1][currCol+1];
        }
        int leftCost;
        if(dp[currRow][currCol+1]==Integer.MIN_VALUE)
        {
            leftCost = helper(matrix, dp, nRows, nCols, currRow, currCol+1);
            dp[currRow][currCol+1] = leftCost;
        }
        else{
            leftCost = dp[currRow][currCol+1];
        }
        return matrix[currRow][currCol]+(Math.min(downCost,Math.min(diagonalCost,leftCost)));
    }
}
