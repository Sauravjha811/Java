package DP_2;

public class minCostPathIt {
    public static void main(String[] args) {
        int[][] matrix = {{1,5,11},{8,13,12},{2,3,7}};
        System.out.println(minCost(matrix));
    }
    private static int minCost(int[][] matrix)
    {
        int nRows = matrix.length;
        int nCols = matrix[0].length;

        // Create An Array for the DP purpose
        int[][] dp = new int[nRows+1][nCols+1];
        for(int currRow=0;currRow<dp.length; currRow++)
        {
            for(int currCol=0;currCol<dp[0].length;currCol++)
            {
                dp[currRow][currCol] = Integer.MAX_VALUE;
            }
        }

        for(int currRow=nRows-1;currRow>=0;currRow--)
        {
            for(int currCol=nCols-1;currCol>=0;currCol--)
            {
                if(currRow==nRows-1 && currCol==nCols-1)
                {
                    dp[currRow][currCol] = matrix[currCol][currCol];
                    continue;
                }
                int ans1 = dp[currRow+1][currCol];
                int ans2 = dp[currRow+1][currCol+1];
                int ans3 = dp[currRow][currCol+1];
                dp[currRow][currCol] = matrix[currRow][currCol]+Math.min(ans1,Math.min(ans2,ans3));
            }
        }
        return dp[0][0];
    }
}
