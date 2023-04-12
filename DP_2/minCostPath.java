package DP_2;

public class minCostPath {
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
        return helper(matrix,nRows,nCols,0,0);
    }
    private static int helper(int[][] matrix, int nRows, int nCols, int currRow, int currCol)
    {
        if(currRow>=nRows || currCol>=nCols){
            return Integer.MAX_VALUE;
        }
        if(currRow==(nRows-1) && currCol==(nCols-1)){
            return matrix[currRow][currCol];
        }
        int downCost = helper(matrix, nRows, nCols, currRow+1,currCol);
        int diagonalCost = helper(matrix, nRows, nCols, currRow+1,currCol+1);
        int leftCost = helper(matrix, nRows, nCols, currRow, currCol+1);

        return matrix[currRow][currCol]+(Math.min(downCost,Math.min(diagonalCost,leftCost)));
    }
}
