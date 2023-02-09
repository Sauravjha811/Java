package TwoD_Arrays_Assignment;

public class totalSumBoundariesDiag {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int dimension = matrix.length;
        System.out.println(totalSum(matrix,dimension));
    }
    private static int firstDiagonalSum(int [][]mat,int dimension)
    {
        int currRow=0;
        int currCol=0;
        int diagonalSum=0;
        while(currRow<dimension && currCol<dimension)
        {
            diagonalSum+=mat[currRow][currCol];
            currRow++;
            currCol++;
        }
        return diagonalSum;
    }
    private static int secondDiagonalSum(int [][]mat,int dimension)
    {
        int currRow=0;
        int currCol=dimension-1;
        int diagonalSum=0;
        while(currRow<dimension && currCol<dimension)
        {
            diagonalSum+=mat[currRow][currCol];
            currRow++;
            currCol--;
        }
        return diagonalSum;
    }
    private static int boundarySum(int[][]mat, int dimension)
    {
        int sum=0;
        for(int i=1;i<(dimension-1);i++)
        {
            System.out.print(mat[0][i]+" ");
            sum+=mat[0][i];// upper side
            System.out.print(mat[dimension-1][i]+" ");
            sum+=mat[dimension-1][i];// lower side
            System.out.println(mat[i][0]+" ");
            sum+=mat[i][0];// left side.
            System.out.print(mat[dimension-1][i]+" ");
            sum+=mat[i][dimension-1];// right side
        }
        return sum;
    }

    private static int totalSum(int[][] matrix, int dimension)
    {
        int totalSum=firstDiagonalSum(matrix, dimension)+secondDiagonalSum(matrix, dimension)+boundarySum(matrix, dimension);
        if(dimension%2!=0)
        {
            totalSum-=matrix[dimension/2][dimension/2];
        }
        return totalSum;
    }
}
