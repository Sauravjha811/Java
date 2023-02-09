package TwoD_Arrays_Assignment;

public class printSpiral {
    public static void main(String[] args) {
        int [][]mat = {{1,2,3,4},{14,15,16,5},{13,20,17,6},{12,19,18,7},{11,10,9,8}};
        spiral(mat);
    }
    private static void spiral(int[][]mat)
    {
        int row = mat.length-1;
        if(row<=0)
        {
            return;
        }
        int col=mat[0].length-1;
        int i,rowStart=0,colStart=0;
        int numElements = (row+1)*(col+1), count=0;

        while(count<numElements)
        {
            for(i=colStart;count<numElements && i<=col;i++)
            {
                System.out.print(mat[rowStart][i]+" ");
                count++;
            }
            rowStart++;
            for(i=rowStart;count<numElements && i<=row;i++)
            {
                System.out.print(mat[i][col]+" ");
                count++;
            }
            col--;
            for(i=col;count<numElements && i>=colStart;i--)
            {
                System.out.print(mat[row][i]+" ");
                count++;
            }
            row--;
            for(i=row;count<numElements && i>=rowStart;i--)
            {
                System.out.print(mat[i][colStart]+" ");
                count++;
            }
            colStart++;
        }
    }
}
